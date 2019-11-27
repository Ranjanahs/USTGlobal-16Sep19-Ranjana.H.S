package com.ustglobal.jdbcinhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jdbcinhibernate.dto.Employee;

public class InsertDemo {
public static void main(String[] args) {
	
	Employee emp = new Employee();
	emp.setId(4);
	emp.setName("Ranjan");
	emp.setSalary(40000);
	emp.setGender("M");
	
//	emp.setId(2);
//	emp.setName("Anjana");
//	emp.setSalary(40000);
//	emp.setGender("F");
	
//	emp.setId(3);
//	emp.setName("Sanjana");
//	emp.setSalary(30000);
//	emp.setGender("F");
//	
	EntityManager em = null;
	EntityTransaction et = null;
	
	try {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
	em = emf.createEntityManager();
	et = em.getTransaction();
	et.begin();
	
	em.persist(emp);
	
	System.out.println("record saved");
	et.commit();
	
	
}catch(Exception e) {
	e.printStackTrace();
	et.rollback();
}
	em.close();
	
	
}
}
