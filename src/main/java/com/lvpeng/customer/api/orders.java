package com.lvpeng.customer.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.bean.GoodsBean;
import com.lvpeng.customer.bean.OrderCountBean;
import com.lvpeng.seller.common.ResultBean;

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
			List<GoodsBean> goodsBeanList = new ArrayList<GoodsBean>();
			result.setData(goodsBeanList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
