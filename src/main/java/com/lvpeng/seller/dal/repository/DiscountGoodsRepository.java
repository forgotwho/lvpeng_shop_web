package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.DiscountGoods;

public interface DiscountGoodsRepository extends MongoRepository<DiscountGoods, String> {

}
