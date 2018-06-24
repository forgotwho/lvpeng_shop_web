package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.MemberCard;

public interface MemberCardRepository extends MongoRepository<MemberCard, String> {
	public MemberCard findByShopId(int shopId);
}
