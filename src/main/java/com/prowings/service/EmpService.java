package com.prowings.service;

import org.springframework.http.ResponseEntity;

import com.prowings.model.Employee;

public interface EmpService {
	
	public ResponseEntity<Employee> getEmployee(int id);

}
