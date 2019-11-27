package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class RetrieveDemo {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager em = emf.createEntityManager();
    
	String jpql = "from Product";
	//String jpql = "select pname from Product";
    
	Query query = em.createQuery(jpql);//to create obj n query
    List<Product> pname = query.getResultList();
    //List<String> pname = query.getResultList();
    
    for (int i=0;i<pname.size();i++) {
    	Object res = pname.get(i);
    	//System.out.println(product2.getPid());
    	System.out.println(res);
    	//System.out.println(product2.getQuantity());
		
	}
    em.close();
    }
}
