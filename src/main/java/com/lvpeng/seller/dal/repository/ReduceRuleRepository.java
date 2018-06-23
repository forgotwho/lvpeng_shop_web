package com.lvpeng.seller.dal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.ReduceRule;

public interface ReduceRuleRepository extends MongoRepository<ReduceRule, String> {

	public List<ReduceRule> findByShopId(int shopId);
}
