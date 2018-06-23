package com.lvpeng.seller.api;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.DeliveryUser;
import com.lvpeng.seller.dal.repository.DeliveryUserRepository;

@RestController
@RequestMapping("/deliver_user")
public class DeliveryUserController {

	@Autowired
	private DeliveryUserRepository deliveryUserRepository;

	/**
	 * 配送员列表
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean getDeliverUserList(@RequestHeader("shop_id") int shopId) {
		ResultBean result = new ResultBean();
		List<DeliveryUser> beanList = deliveryUserRepository.findByShopId(shopId);
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 创建
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean createDeliverUser(@RequestHeader("shop_id") int shopId, @RequestBody DeliveryUser data) {
		ResultBean result = new ResultBean();
		data.setShopId(shopId);
		data.setCreateTime(new Date());
		deliveryUserRepository.save(data);
		result.setCode(0);
		return result;
	}

	/**
	 * 删除
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResultBean removeDeliverUser(@PathVariable String id) {
		ResultBean result = new ResultBean();
		deliveryUserRepository.deleteById(id);
		result.setCode(0);
		return result;
	}

	/**
	 * 更新
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public ResultBean updateDeliverUser(@RequestBody DeliveryUser data) {
		ResultBean result = new ResultBean();
		data.setUpdateTime(new Date());
		deliveryUserRepository.save(data);
		result.setCode(0);
		return result;
	}

}
