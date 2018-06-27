package com.lvpeng.seller.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.ShopStatusInfo;

public interface ShopStatusInfoRepository extends MongoRepository<ShopStatusInfo, String> {
	
	public ShopStatusInfo findByShopId(int shopId);
}
