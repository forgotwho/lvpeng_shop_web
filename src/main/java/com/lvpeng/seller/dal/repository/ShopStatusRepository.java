package com.lvpeng.seller.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.ShopStatus;

public interface ShopStatusRepository extends MongoRepository<ShopStatus, String> {
	
	public ShopStatus findByShopId(int shopId);
}
