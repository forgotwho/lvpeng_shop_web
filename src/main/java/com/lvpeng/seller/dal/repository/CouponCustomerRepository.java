package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.CouponCustomer;

public interface CouponCustomerRepository extends MongoRepository<CouponCustomer, String> {

}
