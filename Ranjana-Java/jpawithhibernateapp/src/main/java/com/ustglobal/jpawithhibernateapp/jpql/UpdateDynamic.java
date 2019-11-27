package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDynamic {
public static void main(String[] args) {
	EntityManager em = null;
	  EntityTransaction et = null;
	  try {
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
	  em = emf.createEntityManager();
	  et = em.getTransaction();
	  et.begin();
	  
	  String jpql = "update Product set pname=:name where pid=:id";
	  Query query = em.createQuery(jpql);
	  query.setParameter("name", "Book");
	  query.setParameter("id", 101);
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
