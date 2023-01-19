package com.assignments789.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assignments789.bean.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order,Integer> {

}