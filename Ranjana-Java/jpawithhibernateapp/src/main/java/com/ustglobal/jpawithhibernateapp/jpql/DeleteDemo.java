package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDemo {
public static void main(String[] args) {
	EntityManager em = null;
	  EntityTransaction et = null;
	  try {
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
	  em = emf.createEntityManager();
	  et = em.getTransaction();
	  et.begin();
	  
	  String jpql = "delete from Product where pid=103";
	  Query query = em.createQuery(jpql);
	  int res = query.executeUpdate();
	  System.out.println(res);
	  et.commit();
	   
	  
}catch(Exception e) {
	e.printStackTrace();
	et.rollback();
}finally {
	em.close();
}
}
}
