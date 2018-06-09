package com.lvpeng.seller.api;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.SellerShop;
import com.lvpeng.seller.dal.model.Shop;
import com.lvpeng.seller.dal.model.ShopStatus;
import com.lvpeng.seller.dal.repository.SellerShopRepository;
import com.lvpeng.seller.dal.repository.ShopRepository;
import com.lvpeng.seller.dal.repository.ShopStatusRepository;
import com.lvpeng.seller.util.DateUtils;

@RestController
@RequestMapping("/shops")
public class ShopController {

	@Autowired
	private ShopRepository shopRepository;

	@Autowired
	private ShopStatusRepository shopStatusRepository;

	@Autowired
	private SellerShopRepository sellerShopRepository;

	/**
	 * 获取店铺信息
	 */
	@RequestMapping(method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public ResultBean getShop(@RequestHeader("shop_id") int shopId, String from, String limit) {
		ResultBean result = new ResultBean();
		Shop shop = shopRepository.findById(shopId);
		result.setData(shop);
		result.setCode(0);
		return result;
	}
	
	/**
	 * 更新店铺信息
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public ResultBean updateShop(@RequestBody Shop data) {
		ResultBean result = new ResultBean();
		data.setUpdateTime(new Date());
		shopRepository.save(data);
		SellerShop sellerShop = sellerShopRepository.findByShopId(data.getId());
		sellerShop.setShopName(data.getName());
		sellerShopRepository.save(sellerShop);
		result.setCode(0);
		return result;
	}
	
	/**
	 * 获取店铺状态
	 */
	@RequestMapping(value = "/status", method = RequestMethod.GET)
	public ResultBean getShopStatus(@RequestHeader("shop_id") int shopId) {
		ResultBean result = new ResultBean();
		result.setCode(0);
		ShopStatus bean = shopStatusRepository.findByShopId(shopId);
		if (bean == null) {
			bean = new ShopStatus();
			bean.setShopId(shopId);
			bean.setOpen(true);
			bean.setStatus("NORMAL");
			bean.setBeginTime("00:00");
			bean.setEndTime("23:59");
			bean = shopStatusRepository.save(bean);
		}
		result.setData(bean);
		return result;
	}
	
	/**
	 * 修改店铺状态
	 */
	@RequestMapping(value = "/status", method = RequestMethod.PUT)
	public ResultBean updateShopStatus(@RequestHeader("shop_id") int shopId, @RequestBody ShopStatus data) {
		ResultBean result = new ResultBean();
		ShopStatus bean = shopStatusRepository.findByShopId(shopId);
		BeanUtils.copyProperties(data, bean, new String[] { "id", "shopId", "open" });
		String openTime = DateUtils.openTime();
		if (openTime.compareTo(bean.getBeginTime()) >= 1 && openTime.compareTo(bean.getEndTime()) <= -1) {
			bean.setOpen(true);
		} else {
			bean.setOpen(false);
		}
		shopStatusRepository.save(bean);
		result.setCode(0);
		return result;
	}

	/**
	 * 更新店铺信息
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResultBean create(@RequestBody Shop data) {
		ResultBean result = new ResultBean();
		shopRepository.save(data);
		result.setCode(0);
		return result;
	}

	

	

	

}
