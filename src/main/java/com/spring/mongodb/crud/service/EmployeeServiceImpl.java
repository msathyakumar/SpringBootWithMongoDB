package com.spring.mongodb.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mongodb.crud.entity.Employee;
import com.spring.mongodb.crud.entity.EmployeeDto;
import com.spring.mongodb.crud.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeMongoRepo;

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		Employee emp = employeeMongoRepo.save(toEmployee(employeeDto));
		log.info("saved the docuemnt in the collection");
		return toEmployeeDto(emp);
	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		log.info("all emp");
		return employeeMongoRepo.findAll().stream().map(this::toEmployeeDto).toList();
	}

	@Override
	public EmployeeDto getEmployeeById(long id) {
		var res = employeeMongoRepo.findById(id);
		log.info("by id");
		if (res.isPresent()) {
			return toEmployeeDto(res.get());
		}
		return new EmployeeDto();

	}

	@Override
	public String deleteEmployeeById(long id) {
		employeeMongoRepo.deleteById(id);
		log.info("delete by id");
		return "transaction updated successfully";
	}

	public Employee toEmployee(EmployeeDto employee) {
		return new Employee(employee.getId(), employee.getName(), employee.getEmailId(), employee.getDob());
	}

	public EmployeeDto toEmployeeDto(Employee employee) {
		return new EmployeeDto(employee.getId(), employee.getName(), employee.getEmailId(), employee.getDob());
	}

}
