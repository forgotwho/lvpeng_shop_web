package com.lvpeng.customer.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

	public Customer findById(int id);
	
	public Customer findByPhone(String phone);
}
