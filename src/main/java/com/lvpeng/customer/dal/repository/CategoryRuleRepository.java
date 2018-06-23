package com.lvpeng.customer.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.CategoryRule;

public interface CategoryRuleRepository extends MongoRepository<CategoryRule, String> {

}
