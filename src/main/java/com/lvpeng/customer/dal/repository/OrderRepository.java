package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {
}
