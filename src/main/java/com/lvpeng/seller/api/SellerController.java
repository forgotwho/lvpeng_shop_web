package com.lvpeng.seller.api;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Seller;
import com.lvpeng.seller.dal.model.SellerShop;
import com.lvpeng.seller.dal.repository.SellerRepository;
import com.lvpeng.seller.dal.repository.SellerShopRepository;

@RestController
@RequestMapping("/sellers")
public class SellerController {

	@Autowired
	private SellerRepository sellerRepository;

	@Autowired
	private SellerShopRepository sellerShopRepository;

	/**
	 * 获取卖家的店铺列表
	 */
	@RequestMapping(value = "/shop_list", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public ResultBean getSellerShopList(@RequestHeader("login_code") String login_code) {
		ResultBean result = new ResultBean();

		Seller seller = sellerRepository.findByLoginCodeAndExpireTimeGreaterThan(login_code, new Date());
		if (seller == null) {
			result.setCode(-1);
			result.setMessage("非法操作");
			return result;
		}
		List<SellerShop> beanList = sellerShopRepository.findBySellerId(seller.getId());
		result.setCode(0);
		result.setData(beanList);
		return result;
	}

}
