package com.lvpeng.customer.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/goods_group")
public class goods_group {

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean list(Integer from, Integer limit, String status) {
		ResultBean result = new ResultBean();
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
