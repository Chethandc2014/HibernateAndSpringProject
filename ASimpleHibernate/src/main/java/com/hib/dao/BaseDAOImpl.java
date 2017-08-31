package com.hib.dao;

import java.util.Properties;

import oracle.net.aso.s;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hib.entities.Employee;

public class BaseDAOImpl implements BaseDAO {

	private SessionFactory sf;
	
	
	private SessionFactory getSessionFactory(){
		if(sf==null){
			Configuration con=new Configuration();
			con.configure();
			Properties prop = con.getProperties();
			StandardServiceRegistryBuilder srb=new StandardServiceRegistryBuilder();
			StandardServiceRegistry sr = srb.applySettings(prop).build();
			 sf = con.buildSessionFactory(sr);
		}
		
		return sf;
		
	}
	
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		SessionFactory sf = getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(employee);
		
		tx.commit();
		session.close();
		
	}

	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	public void DeleteEmployee() {
		// TODO Auto-generated method stub
		
	}

}
