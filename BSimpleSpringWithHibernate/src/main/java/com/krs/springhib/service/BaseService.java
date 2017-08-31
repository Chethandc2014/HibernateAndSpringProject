package com.krs.springhib.service;

import org.springframework.stereotype.Component;

import com.krs.springhib.entities.Employee;

@Component
public interface BaseService {
 
	public void saveEmployee(Employee employee);
}
