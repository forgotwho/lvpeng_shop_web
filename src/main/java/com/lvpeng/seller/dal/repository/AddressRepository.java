package com.lvpeng.seller.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.CustomerAddress;

public interface AddressRepository extends MongoRepository<CustomerAddress, String> {
	
}
