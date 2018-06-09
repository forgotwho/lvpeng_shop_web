package com.lvpeng.seller.api;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/count/visit_count")
public class VisitCountController {

	/**
	 * 浏览统计
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean visitCount(@RequestHeader("shop_id") int shopId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

}
