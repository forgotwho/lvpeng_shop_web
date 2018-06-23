package com.lvpeng.customer.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.GoodsSkuDetail;

public interface GoodsSkuDetailRepository extends MongoRepository<GoodsSkuDetail, String> {

}
