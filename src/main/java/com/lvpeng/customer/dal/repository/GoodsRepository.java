package com.lvpeng.customer.dal.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Goods;

public interface GoodsRepository extends MongoRepository<Goods, String> {
	
	public List<Goods> findByShopId(int shopId);
	
	public Goods findById(int id);
}
