package com.prowings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.model.Employee;
import com.prowings.service.EmpService;

@RestController
public class EmpMgmtApiRestClient {
	
	@Autowired
	EmpService empService;
	
	@GetMapping("/emp/{id}")
	public ResponseEntity<Employee> getEmployeeByID(@PathVariable("id") int id){
		return empService.getEmployee(id);
	}

}
