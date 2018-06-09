package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Shop;

public interface ShopRepository extends MongoRepository<Shop, String> {

	public Shop findById(int id);
}
