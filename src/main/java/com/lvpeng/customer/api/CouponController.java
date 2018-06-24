package com.lvpeng.customer.api;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.bean.CouponBean;
import com.lvpeng.customer.common.ResultBean;

@RestController
@RequestMapping("/coupons")
public class CouponController {

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean all(@RequestHeader("login_code") String login_code) {
		ResultBean result = new ResultBean();
		try {
			CouponBean couponBean = new CouponBean();
			couponBean.setOwned("");
			couponBean.setShow(new ArrayList<String>());
			result.setData(couponBean);
		} catch (Exception e) {
			e.printStackTrace();
			result.setCode(-1);
		}
		return result;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public ResultBean list(Integer from, Integer limit, String by, String sort, String status) {
		ResultBean result = new ResultBean();
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
