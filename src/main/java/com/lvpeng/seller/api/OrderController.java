package com.lvpeng.seller.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.bean.OrderOfflineBean;
import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.AppConfig;
import com.lvpeng.seller.dal.model.Customer;
import com.lvpeng.seller.dal.model.Order;
import com.lvpeng.seller.dal.model.Shop;
import com.lvpeng.seller.dal.model.UserToken;
import com.lvpeng.seller.dal.repository.AppConfigRepository;
import com.lvpeng.seller.dal.repository.CustomerRepository;
import com.lvpeng.seller.dal.repository.OrderRepository;
import com.lvpeng.seller.dal.repository.ShopRepository;
import com.lvpeng.seller.dal.repository.UserTokenRepository;
import com.lvpeng.seller.util.RandomUtils;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private UserTokenRepository userTokenRepository;

	@Autowired
	private AppConfigRepository appConfigRepository;
	
	@Autowired
	private CustomerRepository userRepository;
	
	@Autowired
	private ShopRepository shopRepository;

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
	public ResultBean list(Integer from, Integer limit, Integer status) {
		ResultBean result = new ResultBean();
		try {
			List<Order> orderList = new ArrayList<Order>();
			if(status!=null&&status.intValue()>0){
				orderList = orderRepository.findByStatus(status);
			}else{
				orderList = orderRepository.findAll();
			}
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
			order = orderRepository.findByOrderId(id);
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
	
	@RequestMapping( method = RequestMethod.POST)
	@ResponseBody
	public ResultBean add(@RequestHeader("login_code") String login_code,@RequestBody Order order) {
		ResultBean result = new ResultBean();
		try {
			Date expireTime = new Date();
			UserToken userToken = userTokenRepository.findByLoginCodeAndExpireTimeGreaterThan(login_code, expireTime);
			if (userToken == null) {
				result.setCode(-1);
				return result;
			}

			AppConfig appConfig = appConfigRepository.findByAppCode(userToken.getAppCode());
			
			Customer user = userRepository.findByAppCodeAndOpenId(appConfig.getAppCode(), userToken.getOpenId());

			Shop shop = shopRepository.findById(appConfig.getShopId());
			
			int orderId = (int)orderRepository.count()+1;
			order.setShopId(shop.getId());
			order.setShopName(shop.getName());
			order.setUuid(RandomUtils.memberNumber());
			order.setOrderId(orderId);
			order.setCustomerId(user.getId());
			order.setOrderTime(new Date());
			order.setStatus(1);
			order.setCustomer(user);
			order = orderRepository.save(order);
			result.setData(order);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 关闭订单
	 */
	@RequestMapping(value = "/{orderId}/status/close", method = RequestMethod.PUT)
	public ResultBean close(@PathVariable Integer orderId, String note) {
		ResultBean result = new ResultBean();
		Order order = orderRepository.findByOrderId(orderId);
		order.setStatus(7);
		order.setMessage(note);
		orderRepository.save(order);
		result.setCode(0);
		return result;
	}
	
	/**
	 * 确认收货
	 */
	@RequestMapping(value = "/{orderId}/status/comments", method = RequestMethod.PUT)
	public ResultBean confirmOrder(@PathVariable Integer orderId) {
		ResultBean result = new ResultBean();
		Order order = orderRepository.findByOrderId(orderId);
		order.setStatus(4);
		orderRepository.save(order);
		result.setCode(0);
		return result;
	}
}
