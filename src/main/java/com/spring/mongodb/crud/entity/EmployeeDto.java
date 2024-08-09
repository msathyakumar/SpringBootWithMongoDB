package com.spring.mongodb.crud.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDto {

	private long id;
	private String name;
	private String emailId;
	private String dob;
}
