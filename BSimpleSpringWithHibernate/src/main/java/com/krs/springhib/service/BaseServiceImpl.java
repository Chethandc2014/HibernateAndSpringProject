package com.krs.springhib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.krs.springhib.dao.BaseDAO;
import com.krs.springhib.entities.Employee;


@Component
public class BaseServiceImpl implements BaseService{

	@Autowired
	private BaseDAO baseDAO;
	
	public void setBaseDAO(BaseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}

	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		baseDAO.saveEmployee(employee);
	}

}
