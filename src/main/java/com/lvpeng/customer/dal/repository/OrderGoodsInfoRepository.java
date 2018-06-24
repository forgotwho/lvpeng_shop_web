package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.OrderGoodsInfo;

public interface OrderGoodsInfoRepository extends MongoRepository<OrderGoodsInfo, String> {
}
