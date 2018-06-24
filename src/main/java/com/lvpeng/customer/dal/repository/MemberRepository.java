package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Member;

public interface MemberRepository extends MongoRepository<Member, String> {
}
