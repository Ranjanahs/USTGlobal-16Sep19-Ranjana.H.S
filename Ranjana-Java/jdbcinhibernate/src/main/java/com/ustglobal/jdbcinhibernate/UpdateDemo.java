package com.ustglobal.jdbcinhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jdbcinhibernate.dto.Employee;

public class UpdateDemo {
public static void main(String[] args) {
	
	EntityManager em = null;
	EntityTransaction et = null;
	
	try {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
		em = emf.createEntityManager();
		et = em.getTransaction();
		et.begin();
		
		Employee emp = em.find(Employee.class, 1);
		emp.setGender("F");
		
		System.out.println("updated");
		
		et.commit();
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
		et.rollback();
	}
	em.close();
}
}
