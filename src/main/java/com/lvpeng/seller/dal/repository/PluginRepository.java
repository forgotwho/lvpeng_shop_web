package com.lvpeng.seller.dal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Plugin;

public interface PluginRepository extends MongoRepository<Plugin, String> {

	public List<Plugin> findByShopId(int shopId);

	public Plugin findByShopIdAndType(int shopId, String type);
}
