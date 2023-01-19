package com.assignments789.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assignments789.bean.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,Integer> {

}
