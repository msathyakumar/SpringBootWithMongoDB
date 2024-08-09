package com.spring.mongodb.crud.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collation = "employee")
public class Employee {

	@Id
	private long id;
	private String name;
	private String emailId;
	private String dob;
}
