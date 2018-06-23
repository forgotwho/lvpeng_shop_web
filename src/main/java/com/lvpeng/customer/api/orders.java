package com.lvpeng.customer.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.bean.OrderBean;
import com.lvpeng.customer.bean.OrderCountBean;
import com.lvpeng.customer.bean.OrderOfflineBean;
import com.lvpeng.customer.common.ResultBean;

@RestController
@RequestMapping("/orders")
public class orders {

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean count() {
		ResultBean result = new ResultBean();
		try {
			OrderCountBean orderCountBean = new OrderCountBean();
			result.setData(orderCountBean);
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
			List<OrderBean> orderBeanList = new ArrayList<OrderBean>();
			result.setData(orderBeanList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean detail(Integer id) {
		ResultBean result = new ResultBean();
		try {
			OrderBean orderBean = new OrderBean();
			result.setData(orderBean);
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
