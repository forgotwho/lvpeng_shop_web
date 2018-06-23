package com.lvpeng.customer.dal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {
	public List<Order> findByShopId(int shopId);
	
	public Order findByOrderId(int orderId);
}
