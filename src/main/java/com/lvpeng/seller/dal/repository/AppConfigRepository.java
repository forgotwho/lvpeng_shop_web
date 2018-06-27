package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.AppConfig;

public interface AppConfigRepository extends MongoRepository<AppConfig, String> {

	public AppConfig findByAppCode(String appCode);
}
