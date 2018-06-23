package com.lvpeng.customer.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.common.ResultBean;

@RestController
@RequestMapping("/members")
public class members {

	@RequestMapping(value = "/bonus_detail", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean bonus_detail(Integer from, Integer limit, String by, String sort) {
		ResultBean result = new ResultBean();
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
