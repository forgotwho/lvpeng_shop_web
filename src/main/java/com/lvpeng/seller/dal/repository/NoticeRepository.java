package com.lvpeng.seller.dal.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Notice;

public interface NoticeRepository extends MongoRepository<Notice, String> {
	
	public List<Notice> findByShopId(int shopId);
}
