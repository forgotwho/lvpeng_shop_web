package com.lvpeng.seller.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.OrderPriceHistory;

public interface OrderPriceHistoryRepository extends MongoRepository<OrderPriceHistory, String> {
}
