package com.krs.springhib.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krs.springhib.entities.Employee;
import com.krs.springhib.service.BaseServiceImpl;


public class Client {

	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		BaseServiceImpl baseServiceImpl = (BaseServiceImpl) applicationContext.getBean("baseServiceImpl");
		
		Employee employee=new Employee();
		employee.setEmployeeId(126);
		employee.setFirstName("DC");
		baseServiceImpl.saveEmployee(employee);
	}
	
	

}
