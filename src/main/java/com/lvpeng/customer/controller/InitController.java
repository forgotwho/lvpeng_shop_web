package com.lvpeng.customer.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.customer.common.ResultBean;
import com.lvpeng.customer.dal.model.Shop;
import com.lvpeng.customer.dal.model.ShopChargeLimit;
import com.lvpeng.customer.dal.repository.ShopChargeLimitRepository;
import com.lvpeng.customer.dal.repository.ShopRepository;

@RestController
@RequestMapping("/init")
public class InitController {

	@Autowired
	private ShopRepository shopRepository;

	@Autowired
	private ShopChargeLimitRepository shopChargeLimitRepository;

	/**
	 * 初始化数据
	 */
	@RequestMapping()
	public ResultBean init() {
		ResultBean result = new ResultBean();

		shopRepository.deleteAll();
		shopChargeLimitRepository.deleteAll();

		Shop shop = new Shop();
		shop.setId(1);
		shop.setName("十堰饭来张口");
		shop.setAvatar("http://ostb6zm4z.bkt.clouddn.com/SMGZJ.png");
		shop.setExpiredTime("2019-06-08 00:00:00");
		shop.setCreateTime(new Date());
		shop = shopRepository.save(shop);

		ShopChargeLimit shopChargeLimit = new ShopChargeLimit();
		shopChargeLimit.setShopId(shop.getId());
		shopChargeLimit.setCouponLimit(100);
		shopChargeLimit.setMemberLimit(100);
		shopChargeLimit.setMpLimit(100);
		shopChargeLimit.setOrderLimit(100);
		shopChargeLimit.setSmsLimit(100);
		shopChargeLimit.setCreateTime(new Date());
		shopChargeLimit = shopChargeLimitRepository.save(shopChargeLimit);

		result.setCode(0);
		return result;
	}

}
