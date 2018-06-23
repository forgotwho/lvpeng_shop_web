package com.lvpeng.customer.dal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.InnerCategory;

public interface InnerCategoryRepository extends MongoRepository<InnerCategory, String> {
	
	public InnerCategory findById(int id);
	public List<InnerCategory> findByShopId(int shopId);

}
