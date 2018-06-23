package com.lvpeng.customer.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.DiscountCategory;

public interface DiscountCategoryRepository extends MongoRepository<DiscountCategory, String> {

}
