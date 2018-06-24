package com.lvpeng.customer.api;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lvpeng.customer.bean.CheckSessionBean;
import com.lvpeng.customer.bean.SessionBean;
import com.lvpeng.customer.bean.UserinfoBean;
import com.lvpeng.customer.common.ResultBean;
import com.lvpeng.customer.dal.model.User;
import com.lvpeng.customer.dal.model.UserToken;
import com.lvpeng.customer.dal.repository.UserRepository;
import com.lvpeng.customer.dal.repository.UserTokenRepository;
import com.lvpeng.customer.util.RandomUtils;
import com.lvpeng.customer.util.WeChatUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private Logger logger = LoggerFactory.getLogger(AuthController.class);

	@Value("${wechat.appid:}")
	private String appId;

	@Value("${wechat.secret:}")
	private String secret;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserTokenRepository userTokenRepository;

	@RequestMapping(value = "/session", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean session(String code, String app_code) {
		ResultBean result = new ResultBean();
		try {
			logger.info("request code={}", code);
			String okResult = WeChatUtil.login(appId, secret, code);
			logger.info("response result={}", okResult);

			JSONObject jsonResult = JSON.parseObject(okResult);
			Integer errcode = jsonResult.getInteger("errcode");
			if (errcode == null) {
				String openid = jsonResult.getString("openid");
				String unionid = jsonResult.getString("unionid");
				String third_session = jsonResult.getString("session_key");

				UserToken userToken = new UserToken();
				userToken.setAppCode(app_code);
				userToken.setCreateTime(new Date());
				Date expireTime = new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24);
				userToken.setExpireTime(expireTime);
				userToken.setLastLoginTime(new Date());
				userToken.setLoginCode(RandomUtils.loginCode());
				userToken.setOpenId(openid);
				userToken.setThirdSession(third_session);
				userToken = userTokenRepository.save(userToken);

				User user = userRepository.findByAppCodeAndOpenid(app_code, openid);
				if (user == null) {
					user = new User();
					user.setAppCode(app_code);
					user.setCreateTime(new Date());
					user.setOpenId(openid);
					user.setUnionId(unionid);
					userRepository.save(user);
				}

				SessionBean sessionBean = new SessionBean();
				sessionBean.setLogin_code(userToken.getLoginCode());
				sessionBean.setThird_session(userToken.getThirdSession());
				result.setData(sessionBean);
			} else {
				result.setCode(-1);
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/check_session", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean check_session(String login_code) {
		ResultBean result = new ResultBean();
		try {
			CheckSessionBean checkSessionBean = new CheckSessionBean();
			Date expireTime = new Date();
			UserToken userToken = userTokenRepository.findByLoginCodeAndExpireTimeGreaterThan(login_code, expireTime);
			if (userToken == null) {
				result.setCode(-1);
				return result;
			}
			checkSessionBean.setResult("SUCCESS");
			result.setData(checkSessionBean);
		} catch (Exception e) {
			e.printStackTrace();
			result.setCode(-1);
		}
		return result;
	}

	@RequestMapping(value = "/decode_userinfo", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean decode_userinfo(String encryptedData, String iv, String thirdSession, String app_code) {
		ResultBean result = new ResultBean();
		try {
			UserinfoBean userinfoBean = new UserinfoBean();
			Date expireTime = new Date();
			UserToken userToken = userTokenRepository.findByThirdSessionAndExpireTimeGreaterThan(thirdSession,
					expireTime);
			if (userToken == null) {
				result.setCode(-1);
				return result;
			}
			User user = userRepository.findByAppCodeAndOpenid(app_code, userToken.getOpenId());
			userinfoBean.setUser(user);
			result.setData(userinfoBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
