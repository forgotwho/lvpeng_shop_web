package com.lvpeng.seller.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Member;

public interface MemberRepository extends MongoRepository<Member, String> {
	
	public Member findByShopId(int shopId);
}
