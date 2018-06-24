package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.GoodsDetail;

public interface GoodsDetailRepository extends MongoRepository<GoodsDetail, String> {
}
