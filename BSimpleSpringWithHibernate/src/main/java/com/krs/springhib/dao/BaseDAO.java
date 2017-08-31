package com.krs.springhib.dao;

import org.springframework.stereotype.Component;

import com.krs.springhib.entities.Employee;

@Component
public interface BaseDAO {
   public void saveEmployee(Employee employee);
}
