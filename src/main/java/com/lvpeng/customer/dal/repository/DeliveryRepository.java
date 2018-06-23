package com.lvpeng.customer.dal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Delivery;

public interface DeliveryRepository extends MongoRepository<Delivery, String> {
	public List<Delivery> findByShopId(int shopId);
}
