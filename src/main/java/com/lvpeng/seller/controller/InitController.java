package com.lvpeng.seller.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lvpeng.seller.common.ResultBean;
import com.lvpeng.seller.dal.model.Customer;
import com.lvpeng.seller.dal.model.Seller;
import com.lvpeng.seller.dal.model.SellerShop;
import com.lvpeng.seller.dal.model.Shop;
import com.lvpeng.seller.dal.model.ShopCategory;
import com.lvpeng.seller.dal.model.ShopChargeLimit;
import com.lvpeng.seller.dal.repository.CustomerRepository;
import com.lvpeng.seller.dal.repository.SellerRepository;
import com.lvpeng.seller.dal.repository.SellerShopRepository;
import com.lvpeng.seller.dal.repository.ShopCategoryRepository;
import com.lvpeng.seller.dal.repository.ShopChargeLimitRepository;
import com.lvpeng.seller.dal.repository.ShopRepository;

@RestController
@RequestMapping("/init")
public class InitController {

	@Autowired
	private SellerRepository sellerRepository;

	@Autowired
	private SellerShopRepository sellerShopRepository;

	@Autowired
	private ShopRepository shopRepository;

	@Autowired
	private ShopChargeLimitRepository shopChargeLimitRepository;

	@Autowired
	private ShopCategoryRepository shopCategoryRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	/**
	 * 初始化数据
	 */
	@RequestMapping()
	public ResultBean init() {
		ResultBean result = new ResultBean();

		sellerRepository.deleteAll();
		sellerShopRepository.deleteAll();
		shopRepository.deleteAll();
		shopChargeLimitRepository.deleteAll();

		Seller seller = new Seller();
		seller.setId(1);
		seller.setName("吕鹏");
		seller.setPhone("13800138000");
		seller.setAppCode("XXX");
		seller.setStatus("01");
		seller.setCreateTime(new Date());

		seller = sellerRepository.save(seller);

		Shop shop = new Shop();
		shop.setId(1);
		shop.setName("十堰饭来张口");
		shop.setAvatar("http://ostb6zm4z.bkt.clouddn.com/SMGZJ.png");
		shop.setExpiredTime("2019-06-08 00:00:00");
		shop.setCreateTime(new Date());
		shop = shopRepository.save(shop);

		SellerShop sellerShop = new SellerShop();
		sellerShop.setSeller(seller.getName());
		sellerShop.setSellerId(seller.getId());
		sellerShop.setShopId(shop.getId());
		sellerShop.setShopName(shop.getName());
		sellerShop.setAvatar(shop.getAvatar());
		sellerShop.setExpiredTime(shop.getExpiredTime());
		sellerShop.setCreateTime(new Date());

		sellerShop = sellerShopRepository.save(sellerShop);

		ShopChargeLimit shopChargeLimit = new ShopChargeLimit();
		shopChargeLimit.setShopId(shop.getId());
		shopChargeLimit.setCouponLimit(100);
		shopChargeLimit.setMemberLimit(100);
		shopChargeLimit.setMpLimit(100);
		shopChargeLimit.setOrderLimit(100);
		shopChargeLimit.setSmsLimit(100);
		shopChargeLimit.setCreateTime(new Date());
		shopChargeLimit = shopChargeLimitRepository.save(shopChargeLimit);

		seller = new Seller();
		seller.setId(2);
		seller.setName("Risingsun");
		seller.setPhone("13800138001");
		seller.setAppCode("XXX");
		seller.setStatus("01");
		seller.setCreateTime(new Date());

		seller = sellerRepository.save(seller);

		shop = new Shop();
		shop.setId(2);
		shop.setName("南化饭来张口");
		shop.setAvatar("http://img.leshare.shop/seller/shulanriyongpin.png");
		shop.setExpiredTime("2019-06-08 00:00:00");
		shop.setCreateTime(new Date());
		shop = shopRepository.save(shop);

		sellerShop = new SellerShop();
		sellerShop.setSeller(seller.getName());
		sellerShop.setSellerId(seller.getId());
		sellerShop.setShopId(shop.getId());
		sellerShop.setShopName(shop.getName());
		sellerShop.setAvatar(shop.getAvatar());
		sellerShop.setExpiredTime(shop.getExpiredTime());
		sellerShop.setCreateTime(new Date());

		sellerShop = sellerShopRepository.save(sellerShop);

		shopChargeLimit = new ShopChargeLimit();
		shopChargeLimit.setShopId(shop.getId());
		shopChargeLimit.setCouponLimit(100);
		shopChargeLimit.setMemberLimit(100);
		shopChargeLimit.setMpLimit(100);
		shopChargeLimit.setOrderLimit(100);
		shopChargeLimit.setSmsLimit(100);
		shopChargeLimit.setCreateTime(new Date());
		shopChargeLimit = shopChargeLimitRepository.save(shopChargeLimit);

		shop = new Shop();
		shop.setId(3);
		shop.setName("上海饭来张口");
		shop.setAvatar("http://img.leshare.shop/seller/shulanriyongpin.png");
		shop.setExpiredTime("2019-06-08 00:00:00");
		shop.setCreateTime(new Date());
		shop = shopRepository.save(shop);

		sellerShop = new SellerShop();
		sellerShop.setSeller(seller.getName());
		sellerShop.setSellerId(seller.getId());
		sellerShop.setShopId(shop.getId());
		sellerShop.setShopName(shop.getName());
		sellerShop.setAvatar(shop.getAvatar());
		sellerShop.setExpiredTime(shop.getExpiredTime());
		sellerShop.setCreateTime(new Date());

		sellerShop = sellerShopRepository.save(sellerShop);

		shopChargeLimit = new ShopChargeLimit();
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

	@RequestMapping(value = "/category")
	public ResultBean category() {
		ResultBean result = new ResultBean();
		ShopCategory shopCategory = new ShopCategory();
		shopCategory.setId(1);
		shopCategory.setName("餐饮");
		shopCategory.setPid(0);
		shopCategoryRepository.save(shopCategory);

		shopCategory = new ShopCategory();
		shopCategory.setId(2);
		shopCategory.setName("水果");
		shopCategory.setPid(0);
		shopCategoryRepository.save(shopCategory);

		shopCategory = new ShopCategory();
		shopCategory.setId(3);
		shopCategory.setName("家电");
		shopCategory.setPid(0);
		shopCategoryRepository.save(shopCategory);
		
		shopCategory = new ShopCategory();
		shopCategory.setId(4);
		shopCategory.setName("艺术");
		shopCategory.setPid(0);
		shopCategoryRepository.save(shopCategory);
		return result;

	}
	
	@RequestMapping(value = "/customer")
	public void customer() {
		customerRepository.deleteAll();
		Customer customer = new Customer();
		customer.setAppCode("XXX");
		customer.setAvatarUrl("http://img.leshare.shop/seller/shulanriyongpin.png");
		customer.setCity("上海市");
		customer.setCountry("中国");
		customer.setGender("M");
		customer.setId(1);
		customer.setLanguage("zh_CN");
		customer.setLeAppid(1);
		customer.setMember("");
		customer.setNickName("Risingsun");
		customer.setOpenId("1234567");
		customer.setPhone("13816638520");
		customer.setProvince("上海");
		customer.setUnionId("");
		customer.setCreateTime(new Date());
		customerRepository.save(customer);
	}
	
	

}
