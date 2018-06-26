package com.lvpeng.customer.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.CouponCustomerCount;

public interface CouponCustomerCountRepository extends MongoRepository<CouponCustomerCount, String> {

}
