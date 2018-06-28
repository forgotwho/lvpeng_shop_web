package com.lvpeng.seller.dal.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {
	
	public Order findById(int id);
	
	public List<Order> findByStatus(int status);
	
	public Order findByOrderId(int orderId);
}
