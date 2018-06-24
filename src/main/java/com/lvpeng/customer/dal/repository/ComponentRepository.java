package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Component;

public interface ComponentRepository extends MongoRepository<Component, String> {
}
