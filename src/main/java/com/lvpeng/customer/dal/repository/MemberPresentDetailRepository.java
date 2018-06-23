package com.lvpeng.customer.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.MemberPresentDetail;

public interface MemberPresentDetailRepository extends MongoRepository<MemberPresentDetail, String> {

}
