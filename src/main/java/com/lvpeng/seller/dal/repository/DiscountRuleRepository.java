package com.lvpeng.seller.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.DiscountRule;

public interface DiscountRuleRepository extends MongoRepository<DiscountRule, String> {
}
