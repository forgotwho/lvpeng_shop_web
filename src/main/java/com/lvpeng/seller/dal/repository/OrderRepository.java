package com.lvpeng.seller.dal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {
	public List<Order> findByShopId(int shopId);
	
	public Order findByOrderId(int orderId);
}
