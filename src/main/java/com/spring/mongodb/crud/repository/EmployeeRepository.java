package com.spring.mongodb.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongodb.crud.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
