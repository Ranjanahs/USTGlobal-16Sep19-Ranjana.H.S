package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReAttaching {
	public static void main(String[] args) {
		
	EntityManager em = null;
	EntityTransaction et = null;
	try {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
	em = emf.createEntityManager();
	et = em.getTransaction();
	et.begin();
	
	Product product = em.find(Product.class,101);
	System.out.println(em.contains(product));
	em.detach(product);
	System.out.println(em.contains(product));
	Product p = em.merge(product);
	p.setPname("Bag");
	
	System.out.println("update record");
	et.commit();
	
}catch(Exception e) {
	e.printStackTrace();
	et.rollback();
}
	em.close();
}
}