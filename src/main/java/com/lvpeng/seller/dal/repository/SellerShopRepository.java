package com.lvpeng.seller.dal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.SellerShop;

public interface SellerShopRepository extends MongoRepository<SellerShop, String> {

	List<SellerShop> findBySellerId(int sellerId);
	
	SellerShop findByShopId(int shopId);
}
