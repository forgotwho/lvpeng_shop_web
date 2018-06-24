package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.FavoriteGoods;

public interface FavoriteGoodsRepository extends MongoRepository<FavoriteGoods, String> {
}
