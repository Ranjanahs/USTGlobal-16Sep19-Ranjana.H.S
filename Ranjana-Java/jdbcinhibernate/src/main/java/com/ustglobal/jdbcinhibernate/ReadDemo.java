package com.ustglobal.jdbcinhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jdbcinhibernate.dto.Employee;

public class ReadDemo {
 public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
	EntityManager em = emf.createEntityManager();
	
	Employee emp = em.find(Employee.class, 2);
	
	System.out.println("ID------"+emp.getId());
	System.out.println("Name----"+emp.getName());
	System.out.println("Salary--"+emp.getSalary());
	System.out.println("Gender--"+emp.getGender());
	
	em.close();
	
}
	
}
