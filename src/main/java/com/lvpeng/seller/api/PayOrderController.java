package com.lvpeng.seller.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Order;
import com.lvpeng.seller.dal.repository.OrderRepository;
import com.lvpeng.seller.util.WXUtil;

@RestController
@RequestMapping("/wxpay/orders")
public class PayOrderController {

	@Autowired
	private OrderRepository orderRepository;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResultBean detail(@PathVariable Integer id) {
		ResultBean result = new ResultBean();
		try {
			Order order = new Order();
			order = orderRepository.findById(id);
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("timeStamp", WXUtil.getTimeStamp());
			map.put("nonceStr", WXUtil.getNonceStr());
			map.put("packageValue", "packageValue");
			map.put("paySign", "paySign");
			result.setData(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
