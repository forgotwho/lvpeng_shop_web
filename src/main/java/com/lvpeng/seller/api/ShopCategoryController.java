package com.lvpeng.seller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.ShopCategory;
import com.lvpeng.seller.dal.model.ShopChargeLimit;
import com.lvpeng.seller.dal.repository.ShopCategoryRepository;
import com.lvpeng.seller.dal.repository.ShopChargeLimitRepository;

@RestController
public class ShopCategoryController {

	@Autowired
	private ShopCategoryRepository shopCategoryRepository;
	
	@Autowired
	private ShopChargeLimitRepository shopChargeLimitRepository;

	/**
	 * 店铺分类
	 */
	@RequestMapping(value = "/shop_parent_categories/0", method = RequestMethod.GET)
	public ResultBean getShopCategoryList() {
		ResultBean result = new ResultBean();
		List<ShopCategory> beanList = shopCategoryRepository.findAll();
		result.setCode(0);
		result.setData(beanList);
		return result;
	}
	
	@RequestMapping(value = "/shop_charge_limit", produces = "application/json;charset=UTF-8")
	public ResultBean getShopChargeLimit(@RequestHeader("shop_id") int shopId) {
		ResultBean result = new ResultBean();
		ShopChargeLimit bean = shopChargeLimitRepository.findByShopId(shopId);
		result.setCode(0);
		result.setData(bean);

		return result;
	}

}
