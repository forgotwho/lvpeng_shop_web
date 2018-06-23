package com.lvpeng.customer.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Address;

public interface AddressRepository extends MongoRepository<Address, String> {

}
