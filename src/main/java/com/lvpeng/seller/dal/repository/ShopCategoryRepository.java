package com.lvpeng.seller.dal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.ShopCategory;

public interface ShopCategoryRepository extends MongoRepository<ShopCategory, String> {

	public List<ShopCategory> findByPid(int pid);
}
