package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Goods;

public interface GoodsRepository extends MongoRepository<Goods, String> {
}
