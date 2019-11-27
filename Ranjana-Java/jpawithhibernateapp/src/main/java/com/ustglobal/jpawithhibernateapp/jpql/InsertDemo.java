package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertDemo {
public static void main(String[] args) {
	EntityManager em = null;
	  EntityTransaction et = null;
	  try {
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
	  em = emf.createEntityManager();
	  et = em.getTransaction();
	  et.begin();
	  
	  String jpql = "insert into Product(pid,pname,quantity) values(:id,:name,:quantity)";
	  Query query = em.createNativeQuery(jpql);
	  query.setParameter("id", 105);
	  query.setParameter("name", "rubber");
	  query.setParameter("quantity", 400);
	  int res = query.executeUpdate();
	  System.out.println("inserted");
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

