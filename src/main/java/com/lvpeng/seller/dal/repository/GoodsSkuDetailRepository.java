package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.GoodsSkuDetail;

public interface GoodsSkuDetailRepository extends MongoRepository<GoodsSkuDetail, String> {

}
