package com.lvpeng.seller.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.OrderOfflineBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Order;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean count() {
		ResultBean result = new ResultBean();
		try {
			Order order = new Order();
			result.setData(order);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public ResultBean list(Integer from, Integer limit, String status) {
		ResultBean result = new ResultBean();
		try {
			List<Order> orderList = new ArrayList<Order>();
			result.setData(orderList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean detail(@PathVariable Integer id) {
		ResultBean result = new ResultBean();
		try {
			Order order = new Order();
			result.setData(order);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/offline", method = RequestMethod.POST)
	@ResponseBody
	public ResultBean offline(OrderOfflineBean orderOfflineBean) {
		ResultBean result = new ResultBean();
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
