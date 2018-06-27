package com.lvpeng.seller.dal.repository;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.UserToken;

public interface UserTokenRepository extends MongoRepository<UserToken, String> {

	public UserToken findByLoginCodeAndExpireTimeGreaterThan(String loginCode, Date expireTime);

	public UserToken findByThirdSessionAndExpireTimeGreaterThan(String thirdSession, Date expireTime);

	public UserToken findByAppCodeAndOpenId(String appCode, String openId);
}
