package com.lvpeng.seller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Order;
import com.lvpeng.seller.dal.repository.OrderRepository;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;

	/**
	 * 分页方法
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean getOrderList(@RequestHeader("shop_id") int shopId, String from, String limit, String status) {
		ResultBean result = new ResultBean();
		List<Order> beanList = orderRepository.findAll();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 创建订单
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean createOrder(@RequestHeader("shop_id") int shopId, @RequestBody Order data) {
		ResultBean result = new ResultBean();
		int orderId = (int) orderRepository.count() + 1;
		data.setOrderId(orderId);
		orderRepository.save(data);
		result.setCode(0);
		return result;
	}

	/**
	 * 订单备注
	 */
	@RequestMapping(value = "/{orderId}/note", method = RequestMethod.PUT)
	public ResultBean updateOrdreNote(@PathVariable int orderId, String sellerNote) {
		ResultBean result = new ResultBean();
		Order order = orderRepository.findByOrderId(orderId);
		order.setSellerNote(sellerNote);
		orderRepository.save(order);
		result.setCode(0);
		return result;
	}

	/**
	 * 订单详情
	 */
	@RequestMapping(value = "/{orderId}", method = RequestMethod.GET)
	public ResultBean info(@PathVariable int orderId) {
		ResultBean result = new ResultBean();
		Order order = orderRepository.findByOrderId(orderId);
		result.setCode(0);
		result.setData(order);
		return result;
	}

	/**
	 * 物流发货
	 */
	@RequestMapping(value = "/{orderId}/send", method = RequestMethod.PUT)
	public ResultBean send(@PathVariable int orderId) {
		ResultBean result = new ResultBean();
		Order order = orderRepository.findByOrderId(orderId);
		order.setStatus(1);
		orderRepository.save(order);
		result.setCode(0);
		return result;
	}

	/**
	 * 订单打印
	 */
	@RequestMapping(value = "/{orderId}/print", method = RequestMethod.PUT)
	public ResultBean print(@PathVariable String orderId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		return result;
	}

	/**
	 * 关闭订单
	 */
	@RequestMapping(value = "/{orderId}/status/close", method = RequestMethod.PUT)
	public ResultBean close(@PathVariable String orderId, String note) {
		ResultBean result = new ResultBean();
		Order order = orderRepository.findById(orderId).get();
		order.setStatus(2);
		order.setMessage(note);
		orderRepository.save(order);
		result.setCode(0);
		return result;
	}

	/**
	 * 确认收货
	 */
	@RequestMapping(value = "/{orderId}/status/comments", method = RequestMethod.PUT)
	public ResultBean confirmOrder(@PathVariable String orderId) {
		ResultBean result = new ResultBean();
		Order order = orderRepository.findById(orderId).get();
		order.setStatus(3);
		orderRepository.save(order);
		result.setCode(0);
		return result;
	}

	/**
	 * 接单
	 */
	@RequestMapping(value = "/{orderId}/take_food_order", method = RequestMethod.PUT)
	public ResultBean take(@PathVariable String orderId) {
		ResultBean result = new ResultBean();
		Order order = orderRepository.findById(orderId).get();
		order.setStatus(4);
		orderRepository.save(order);
		result.setCode(0);
		return result;
	}

	/**
	 * 订单改价
	 */
	@RequestMapping(value = "/{orderId}/modify_money", method = RequestMethod.PUT)
	public ResultBean reprice(@PathVariable String orderId, String param) {
		ResultBean result = new ResultBean();
		Order order = orderRepository.findById(orderId).get();
		order.setStatus(5);
		orderRepository.save(order);
		result.setCode(0);
		return result;
	}

	/**
	 * 同意退款
	 */
	/**
	 * 拒绝退款
	 */
	@RequestMapping(value = "/{orderId}/refund_money", method = RequestMethod.PUT)
	public ResultBean agreeRefund(@PathVariable String orderId, String isAgree, String disagreeCause) {
		ResultBean result = new ResultBean();
		Order order = orderRepository.findById(orderId).get();
		order.setStatus(6);
		orderRepository.save(order);
		result.setCode(0);
		return result;
	}

}
