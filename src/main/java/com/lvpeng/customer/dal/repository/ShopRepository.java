package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Shop;

public interface ShopRepository extends MongoRepository<Shop, String> {
}
