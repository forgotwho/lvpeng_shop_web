package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.MemberPresentDetail;

public interface MemberPresentDetailRepository extends MongoRepository<MemberPresentDetail, String> {

}
