package com.lvpeng.customer.dal.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.GoodsInnerCategory;

public interface GoodsInnerCategoryRepository extends MongoRepository<GoodsInnerCategory, String> {
	
	public List<GoodsInnerCategory> findByShopId(int shopId);
}
