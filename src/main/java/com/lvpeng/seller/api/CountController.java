package com.lvpeng.seller.api;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.MonthCountBean;
import com.lvpeng.seller.bean.TodayCountBean;
import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/count")
public class CountController {

	/**
	 * 统计
	 */
	@RequestMapping(method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public ResultBean count(@RequestHeader("shop_id") int shopId,String count_type) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		if ("TODAY".equals(count_type)) {
			TodayCountBean bean = new TodayCountBean();
			result.setData(bean);
		} else if ("MONTH".equals(count_type)) {
			MonthCountBean bean = new MonthCountBean();
			result.setData(bean);
		}
		return result;
	}
}
