package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.DiscountRule;

public interface DiscountRuleRepository extends MongoRepository<DiscountRule, String> {
}
