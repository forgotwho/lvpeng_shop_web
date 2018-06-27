package com.lvpeng.seller.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.GoodsDetail;

public interface GoodsDetailRepository extends MongoRepository<GoodsDetail, String> {
}
