package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.GoodsStock;

public interface GoodsStockRepository extends MongoRepository<GoodsStock, String> {

}
