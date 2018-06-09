package com.lvpeng.seller.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.OrderCountBean;
import com.lvpeng.seller.common.ResultBean;

@RestController
@RequestMapping("/count")
public class CountOrderController {

	/**
	 * 订单统计
	 */
	@RequestMapping(value = "/order", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public ResultBean countOrder(@RequestHeader("shop_id") int shopId) {
		ResultBean result = new ResultBean();
		List<OrderCountBean> beanList = new ArrayList<OrderCountBean>();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}
}
