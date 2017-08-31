package com.hib.controller;

import com.hib.dao.BaseDAOImpl;
import com.hib.entities.Employee;
import com.hib.service.BaseService;
import com.hib.service.BaseServiceImpl;

public class Client {
 
	static BaseServiceImpl baseServiceImpl;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      
		 //These values will come from UI   
	         Employee emp=new Employee();
	         emp.setFirstName("Ravi");
	         emp.setLastName("Verma");
	         emp.setGender('M');
	         emp.setEmailId("ravi@g.com");
	         emp.setEmployeeId(124);
	         
	      BaseService baseServiceImplInstance = getBaseServiceImplInstance();
	      baseServiceImplInstance.saveEmployee(emp);
	      
		//System.out.println("SessionFactory ctrated Succesfully");
	}
	
	static BaseService getBaseServiceImplInstance(){
		if(baseServiceImpl==null){
			baseServiceImpl=new BaseServiceImpl();
		}
		return baseServiceImpl;
	}

}
