package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.OrderExpress;

public interface OrderExpressRepository extends MongoRepository<OrderExpress, String> {

}
