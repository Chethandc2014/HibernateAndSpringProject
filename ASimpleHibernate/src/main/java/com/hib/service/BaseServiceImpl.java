package com.hib.service;

import com.hib.dao.BaseDAOImpl;
import com.hib.entities.Employee;

public class BaseServiceImpl implements BaseService{

	private BaseDAOImpl baseDAOImpl;
	
	private BaseDAOImpl getBaseDAOImplInstance(){
		if(baseDAOImpl==null){
			baseDAOImpl=new BaseDAOImpl();
		}
		return baseDAOImpl;
	}
	
	
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		getBaseDAOImplInstance().saveEmployee(employee);
	}

	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	public void DeleteEmployee() {
		// TODO Auto-generated method stub
		
	}

}
