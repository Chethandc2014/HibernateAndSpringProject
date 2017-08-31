package com.hib.dao;

import com.hib.entities.Employee;


public interface BaseDAO {
  public void saveEmployee(Employee emp);
  public Employee getEmployee();
  public void DeleteEmployee();
}
