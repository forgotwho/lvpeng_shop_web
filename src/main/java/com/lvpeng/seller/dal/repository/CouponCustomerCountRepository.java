package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.CouponCustomerCount;

public interface CouponCustomerCountRepository extends MongoRepository<CouponCustomerCount, String> {

}
