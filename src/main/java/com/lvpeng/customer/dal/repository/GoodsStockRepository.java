package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.GoodsStock;

public interface GoodsStockRepository extends MongoRepository<GoodsStock, String> {
}
