package com.lvpeng.seller.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Component;

public interface ComponentRepository extends MongoRepository<Component, String> {
}
