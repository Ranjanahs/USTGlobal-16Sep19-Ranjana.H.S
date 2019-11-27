package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.Voter_Card;

public class Testonetoone {
 public static void main(String[] args) {
	 
	   Voter_Card v = new Voter_Card();
	   v.setVid(10);
	   v.setVname("ranjana");
	 
	 
	    Person p = new Person();
		p.setPid(2);
		p.setPname("ranjana");
		p.setVc(v);
		
		
		EntityManager entityManager =null;
		EntityTransaction entityTransaction=null;
		
		try {
		EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerfactory.createEntityManager();
        entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Voter_Card vcard = entityManager.find(Voter_Card.class, 10);
		System.out.println(vcard.getPerson().getPid());
		
		//entityManager.persist(p);//to insert data-persist()
		
		System.out.println("record saved");
		entityTransaction.commit();//to save in db
		
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}

