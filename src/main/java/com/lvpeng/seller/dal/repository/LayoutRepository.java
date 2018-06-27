package com.lvpeng.seller.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Layout;

public interface LayoutRepository extends MongoRepository<Layout, String> {
	
	public Layout findById(int id);
	
	public Layout findByShopIdAndType(int shopId, String type);
}
