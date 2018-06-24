package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Layout;

public interface LayoutRepository extends MongoRepository<Layout, String> {
}
