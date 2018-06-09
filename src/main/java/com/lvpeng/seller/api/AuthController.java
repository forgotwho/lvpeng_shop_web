package com.lvpeng.seller.api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.CheckBean;
import com.lvpeng.seller.bean.LoginBean;
import com.lvpeng.seller.bean.SmsCodeBean;
import com.lvpeng.seller.common.ErrorBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Seller;
import com.lvpeng.seller.dal.model.SmsCode;
import com.lvpeng.seller.dal.repository.SellerRepository;
import com.lvpeng.seller.dal.repository.SmsCodeRepository;
import com.lvpeng.seller.util.RandomUtils;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private SmsCodeRepository smsCodeRepository;

	@Autowired
	private SellerRepository sellerRepository;

	/**
	 * 登录
	 */
	@RequestMapping(value = "/login", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public ResultBean sellerLogin(String phone, String sms_code, String app_code) {
		ResultBean result = new ResultBean();

		Seller seller = sellerRepository.findByPhone(phone);

		if (seller == null) {
			result.setCode(-1);
			ErrorBean error = new ErrorBean("手机号不存在");
			result.setData(error);
			return result;
		}
		seller = sellerRepository.findByPhoneAndAppCode(phone, app_code);
		if (seller == null) {
			result.setCode(-1);
			ErrorBean error = new ErrorBean("app_code非法");
			result.setData(error);
			return result;
		}

		SmsCode smsCode = smsCodeRepository.findByPhoneAndCode(phone, sms_code);
		if (smsCode == null) {
			result.setCode(-1);
			ErrorBean error = new ErrorBean("验证码错误");
			result.setData(error);
			return result;
		}

		smsCode.setStatus("02");
		smsCodeRepository.save(smsCode);

		seller.setLoginCode(RandomUtils.loginCode());
		seller.setExpireTime(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24));
		seller.setLastLoginTime(new Date());
		seller = sellerRepository.save(seller);

		LoginBean bean = new LoginBean();
		bean.setLogin_code(seller.getLoginCode());

		result.setCode(0);
		result.setData(bean);

		return result;
	}

	/**
	 * 短信验证码
	 */
	@RequestMapping(value = "/sms_code", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public ResultBean sendSmsCode(String phone) {
		ResultBean result = new ResultBean();
		try {
			SmsCode smsCode = new SmsCode();
			smsCode.setPhone(phone);
			smsCode.setCode(RandomUtils.smsCode());
			smsCode.setStatus("01");
			smsCode.setCreateTime(new Date());
			smsCode.setExpireTime(new Date(System.currentTimeMillis() + 1000 * 60 * 2));
			smsCode = smsCodeRepository.save(smsCode);

			SmsCodeBean bean = new SmsCodeBean();
			bean.setResult(smsCode.getCode());

			result.setCode(0);
			result.setData(bean);
		} catch (Exception e) {
			e.printStackTrace();
			result.setCode(-1);
		}
		return result;
	}

	/**
	 * 检查登录情况
	 */
	@RequestMapping(value = "/check", produces = "application/json;charset=UTF-8")
	public ResultBean checkLogin(String login_code) {
		ResultBean result = new ResultBean();
		Seller seller = sellerRepository.findByLoginCodeAndExpireTimeGreaterThan(login_code, new Date());
		if (seller == null) {
			result.setCode(-1);
			result.setMessage("登录已过期");
			return result;
		}
		seller.setUpdateTime(new Date());
		sellerRepository.save(seller);
		CheckBean bean = new CheckBean();
		bean.setResult("SUCCESS");

		result.setCode(0);
		result.setData(bean);

		return result;
	}

}
