package com.spring.mongodb.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongodb.crud.entity.EmployeeDto;
import com.spring.mongodb.crud.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/save")
	public EmployeeDto saveEmployee(@RequestBody EmployeeDto employeeDto) {
		return employeeService.saveEmployee(employeeDto);
	}

	@GetMapping("/all")
	public List<EmployeeDto> getAllEmployees() {
		return employeeService.getAllEmployee();

	}

	@GetMapping("/get/{id}")
	public EmployeeDto getbyId(@PathVariable("id") long id) {
		return employeeService.getEmployeeById(id);

	}

	@DeleteMapping("/delete/{id}")
	public String deletebyId(@PathVariable("id") long id) {
		return employeeService.deleteEmployeeById(id);

	}

}
