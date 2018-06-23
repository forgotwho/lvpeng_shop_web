package com.lvpeng.customer.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.bean.CheckSessionBean;
import com.lvpeng.customer.bean.DecodeUserinfoBean;
import com.lvpeng.customer.bean.SessionBean;
import com.lvpeng.customer.common.ResultBean;

@RestController
@RequestMapping("/auth")
public class auth {

	@RequestMapping(value = "/session", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean session(String code, String app_code) {
		ResultBean result = new ResultBean();
		try {
			SessionBean sessionBean = new SessionBean();
			result.setData(sessionBean);
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
			result.setData(checkSessionBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/decode_userinfo", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean decode_userinfo(String encryptedData, String iv, String thirdSession, String app_code) {
		ResultBean result = new ResultBean();
		try {
			DecodeUserinfoBean decodeUserinfoBean = new DecodeUserinfoBean();
			result.setData(decodeUserinfoBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
