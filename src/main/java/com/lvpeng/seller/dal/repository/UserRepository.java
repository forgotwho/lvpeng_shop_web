package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	public User findByAppCodeAndOpenId(String appCode, String openId);

}
