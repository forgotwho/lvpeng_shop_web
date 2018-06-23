package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Address;

public interface AddressRepository extends MongoRepository<Address, String> {

}
