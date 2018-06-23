package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.GoodsSkuInfo;

public interface GoodsSkuInfoRepository extends MongoRepository<GoodsSkuInfo, String> {

}
