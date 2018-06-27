package com.lvpeng.seller.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.OrderGoodsInfo;

public interface OrderGoodsInfoRepository extends MongoRepository<OrderGoodsInfo, String> {
}
