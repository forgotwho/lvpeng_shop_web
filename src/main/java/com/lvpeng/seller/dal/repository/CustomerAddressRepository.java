package com.lvpeng.seller.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.CustomerAddress;

public interface CustomerAddressRepository extends MongoRepository<CustomerAddress, String> {
	
}
