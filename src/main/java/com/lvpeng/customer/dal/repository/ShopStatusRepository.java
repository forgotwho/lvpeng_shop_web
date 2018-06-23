package com.lvpeng.customer.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.ShopStatus;

public interface ShopStatusRepository extends MongoRepository<ShopStatus, String> {

	public ShopStatus findByShopId(int id);
}
