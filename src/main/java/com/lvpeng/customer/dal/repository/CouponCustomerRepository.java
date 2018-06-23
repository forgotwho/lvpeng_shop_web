package com.lvpeng.customer.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.CouponCustomer;

public interface CouponCustomerRepository extends MongoRepository<CouponCustomer, String> {

}
