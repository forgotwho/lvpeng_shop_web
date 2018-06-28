package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

	public Customer findByAppCodeAndOpenId(String appCode, String openId);
	
	public Customer findById(int id);
	
	public Customer findByPhone(String phone);

}
