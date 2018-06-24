package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.BonusRule;

public interface BonusRuleRepository extends MongoRepository<BonusRule, String> {
}
