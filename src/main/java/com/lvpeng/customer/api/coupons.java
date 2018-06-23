package com.lvpeng.customer.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.bean.CouponAllBean;
import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/coupons")
public class coupons {

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean all(String login_code) {
		ResultBean result = new ResultBean();
		try {
			CouponAllBean couponAllBean = new CouponAllBean();
			result.setData(couponAllBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}