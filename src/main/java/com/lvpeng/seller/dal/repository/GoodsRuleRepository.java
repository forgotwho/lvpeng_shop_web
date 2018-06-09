package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.GoodsRule;

public interface GoodsRuleRepository extends MongoRepository<GoodsRule, String> {

}
