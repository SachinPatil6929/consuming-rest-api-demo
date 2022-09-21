package com.prowings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prowings.model.Employee;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	Environment environment;

	@Override
	public ResponseEntity<Employee> getEmployee(int id) {
		String base_uri = environment.getProperty("api.baseuri");
		String final_uri = base_uri.concat(Integer.toString(id));
		return restTemplate.getForEntity(final_uri.toString(), Employee.class);
	}

}
