package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.ShopChargeLimit;

public interface ShopChargeLimitRepository extends MongoRepository<ShopChargeLimit, String> {

	public ShopChargeLimit findByShopId(int shopId);
}
