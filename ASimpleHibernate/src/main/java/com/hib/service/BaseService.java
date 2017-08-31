package com.hib.service;

import com.hib.entities.Employee;


public interface BaseService {
	public void saveEmployee(Employee emp);

	public Employee getEmployee();

	public void DeleteEmployee();
}
