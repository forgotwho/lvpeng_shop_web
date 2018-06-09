package com.lvpeng.seller.api;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Delivery;
import com.lvpeng.seller.dal.repository.DeliveryRepository;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

	@Autowired
	private DeliveryRepository deliveryRepository;

	/**
	 * 分页方法
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResultBean getDeliveryList(@RequestHeader("shop_id") int shopId, String from, String limit) {
		ResultBean result = new ResultBean();
		List<Delivery> beanList = deliveryRepository.findByShopId(shopId);
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

	/**
	 * 创建
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean createDelivery(@RequestHeader("shop_id") int shopId, @RequestBody List<Delivery> dataList) {
		ResultBean result = new ResultBean();
		for (Delivery data : dataList) {
			data.setShopId(shopId);
			data.setCreateTime(new Date());
			deliveryRepository.save(data);
		}
		result.setCode(0);
		return result;
	}

	/**
	 * 删除
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResultBean removeDelivery(@PathVariable String id) {
		ResultBean result = new ResultBean();
		deliveryRepository.deleteById(id);
		result.setCode(0);
		return result;
	}

	/**
	 * 更新
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResultBean updateDelivery(@PathVariable String id, @RequestBody Delivery data) {
		ResultBean result = new ResultBean();
		Delivery bean = deliveryRepository.findById(id).get();
		BeanUtils.copyProperties(data, bean, new String[] { "id", "createTime", "shopId" });
		bean.setUpdateTime(new Date());
		deliveryRepository.save(bean);
		result.setCode(0);
		return result;
	}

}
