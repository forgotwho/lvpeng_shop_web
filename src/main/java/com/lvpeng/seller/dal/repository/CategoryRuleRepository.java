package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.CategoryRule;

public interface CategoryRuleRepository extends MongoRepository<CategoryRule, String> {

}
