package com.practice.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.practice.entity.Employee;

@Repository
public interface EmpRepo  extends MongoRepository<Employee, Integer>{

}