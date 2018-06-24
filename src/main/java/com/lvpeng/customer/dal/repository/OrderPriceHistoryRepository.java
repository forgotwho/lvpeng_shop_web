package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.OrderPriceHistory;

public interface OrderPriceHistoryRepository extends MongoRepository<OrderPriceHistory, String> {
}
