package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.DiscountCategory;

public interface DiscountCategoryRepository extends MongoRepository<DiscountCategory, String> {

}
