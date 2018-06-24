package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Plugin;

public interface PluginRepository extends MongoRepository<Plugin, String> {
}
