package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.ShopChargeLimit;

public interface ShopChargeLimitRepository extends MongoRepository<ShopChargeLimit, String> {
	
	public ShopChargeLimit findByShopId(int shopId);
}
