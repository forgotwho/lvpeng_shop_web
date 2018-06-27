package com.lvpeng.seller.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD:src/main/java/com/lvpeng/seller/api/CouponController.java
import com.lvpeng.seller.bean.CouponBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Address;
=======
import com.lvpeng.customer.bean.CouponBean;
import com.lvpeng.customer.common.ResultBean;
import com.lvpeng.customer.dal.model.Address;
import com.lvpeng.customer.dal.model.Coupon;
import com.lvpeng.customer.dal.repository.CouponRepository;
>>>>>>> dd2089e1065e1e9b76676005536258713eb9d4b7:src/main/java/com/lvpeng/customer/api/CouponController.java

@RestController
@RequestMapping("/coupons")
public class CouponController {
	
	@Autowired
	private CouponRepository couponRepository;

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
			List<Coupon> couponList = couponRepository.findAll();
			result.setData(couponList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@RequestMapping(value = "/order_available",method = RequestMethod.POST)
	@ResponseBody
	public ResultBean order_available(Address address) {
		ResultBean result = new ResultBean();
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
