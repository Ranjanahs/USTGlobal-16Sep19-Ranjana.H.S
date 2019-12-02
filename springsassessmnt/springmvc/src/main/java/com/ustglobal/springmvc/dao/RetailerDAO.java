package com.ustglobal.springmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.springmvc.dto.Product;
import com.ustglobal.springmvc.dto.Retailer;
@Repository
public class RetailerDAO implements RetailerInterface {

	  @PersistenceUnit
		private EntityManagerFactory factory;

	@Override
	public Retailer login(int id, String password) {
		 String jpql="from Retailer where id=:id and password=:pass";
         EntityManager manager =factory.createEntityManager();
         TypedQuery<Retailer> query =manager.createQuery(jpql,Retailer.class);
         query.setParameter("id", id);
         query.setParameter("pass", password);
         try {
        	 Retailer bean =  query.getSingleResult();
         return bean;
         }catch(Exception e) {
         	e.printStackTrace();
         	return null;
         }

	}

	@Override
	public Product searchProductO(int id) {
		EntityManager manager =factory.createEntityManager();
		return  manager.find(Product.class, id);
	}

	@Override
	public int register(Retailer bean) {
		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			
			
			return bean.getId();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
manager.close();
return -1;
	}

	@Override
	public Retailer searchorders(int id) {
		EntityManager manager =factory.createEntityManager();
		return  manager.find(Retailer.class, id);
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		transaction.begin();
		Retailer bean=  manager.find(Retailer.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	@Override
	public int registerProduct(Product bean) {
		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getPid();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
manager.close();
return -1;
	}

	@Override
	public int buyProduct(int id) {

		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction =manager.getTransaction();
		transaction.begin();
		try {
			Product bean=  manager.find(Product.class, id);
			manager.remove(bean);
			transaction.commit();
			return bean.getPid();
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
