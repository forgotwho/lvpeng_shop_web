package com.lvpeng.customer.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.DiscountGoods;

public interface DiscountGoodsRepository extends MongoRepository<DiscountGoods, String> {

}
