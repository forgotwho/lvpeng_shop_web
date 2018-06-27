package com.lvpeng.seller.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {
	
	public Order findById(int id);
}
