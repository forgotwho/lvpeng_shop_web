package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.GoodsInnerCategory;

public interface GoodsInnerCategoryRepository extends MongoRepository<GoodsInnerCategory, String> {
}
