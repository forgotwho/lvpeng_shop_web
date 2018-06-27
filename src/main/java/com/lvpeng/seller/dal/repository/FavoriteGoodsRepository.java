package com.lvpeng.seller.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.FavoriteGoods;

public interface FavoriteGoodsRepository extends MongoRepository<FavoriteGoods, String> {
}
