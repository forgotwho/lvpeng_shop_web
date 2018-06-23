package com.lvpeng.customer.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.GoodsSkuInfo;

public interface GoodsSkuInfoRepository extends MongoRepository<GoodsSkuInfo, String> {

}
