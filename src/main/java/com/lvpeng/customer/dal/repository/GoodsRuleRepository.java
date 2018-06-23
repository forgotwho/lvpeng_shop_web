package com.lvpeng.customer.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.GoodsRule;

public interface GoodsRuleRepository extends MongoRepository<GoodsRule, String> {

}
