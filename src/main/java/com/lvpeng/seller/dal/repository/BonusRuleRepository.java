package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.BonusRule;

public interface BonusRuleRepository extends MongoRepository<BonusRule, String> {

}
