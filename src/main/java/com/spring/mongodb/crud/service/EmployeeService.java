package com.spring.mongodb.crud.service;

import java.util.List;

import com.spring.mongodb.crud.entity.EmployeeDto;

public interface EmployeeService {

	EmployeeDto saveEmployee(EmployeeDto employeeDto);

	List<EmployeeDto> getAllEmployee();

	EmployeeDto getEmployeeById(long id);

	String deleteEmployeeById(long id);
}
