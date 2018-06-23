package com.lvpeng.seller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/express")
public class ExpressController {

	/**
	 * 查询快递公司列表
	 */
	@RequestMapping(value = "/company", method = RequestMethod.GET)
	public ResultBean company() {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 查询物流信息
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean queryExpressInfo(String orderId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
