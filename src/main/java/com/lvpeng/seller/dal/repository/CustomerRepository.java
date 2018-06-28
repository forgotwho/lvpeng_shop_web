package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

	public Customer findByAppCodeAndOpenId(String appCode, String openId);

}
