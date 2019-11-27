package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class InsertDemo {
	public static void main(String[] args) {
			
		Product product = new Product();
		//product.setPid(103);
		product.setPname("pencil");
		product.setQuantity(10);
		
		EntityManager entityManager =null;
		EntityTransaction entityTransaction=null;
		
		try {
		EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerfactory.createEntityManager();
        entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.persist(product);//to insert data-persist()
		
		System.out.println("record saved");
		entityTransaction.commit();//to save in db
		
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
