package com.krs.springhib.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.krs.springhib.entities.Employee;

@Component
public class BaseDAOImpl implements BaseDAO{

	@Autowired
	private SessionFactory sf;
	
	public Session getSession() {
			return  sf.openSession();
	}
	
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
	    session.close();
		
	}
	
	/**
	 * Spring takes care of Transaction in Declarative way 
	 */
	@Transactional
	public void saveEmployeeSpringDeclaraive(Employee employee) {
		
		Session session = getSession();
		session.save(employee);
		session.close();
	}
	

	public void setFactory(SessionFactory factory) {
		this.sf = factory;
	}

	
}
