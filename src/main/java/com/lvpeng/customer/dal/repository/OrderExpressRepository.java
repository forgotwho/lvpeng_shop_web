package com.lvpeng.customer.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.OrderExpress;

public interface OrderExpressRepository extends MongoRepository<OrderExpress, String> {

}
