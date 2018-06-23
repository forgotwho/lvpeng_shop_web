package com.lvpeng.customer.dal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.ShopCategory;

public interface ShopCategoryRepository extends MongoRepository<ShopCategory, String> {

	public List<ShopCategory> findByPid(int pid);
}
