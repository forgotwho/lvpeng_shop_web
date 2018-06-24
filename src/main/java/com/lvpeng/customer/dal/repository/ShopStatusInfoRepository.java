package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.ShopStatusInfo;

public interface ShopStatusInfoRepository extends MongoRepository<ShopStatusInfo, String> {
	
	public ShopStatusInfo findByShopId(int shopId);
}
