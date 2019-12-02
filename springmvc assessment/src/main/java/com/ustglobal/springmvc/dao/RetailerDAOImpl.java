package com.ustglobal.springmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.ustglobal.springmvc.dto.ProductBean;
import com.ustglobal.springmvc.dto.RetailerBean;

@Repository
@Controller
public class RetailerDAOImpl implements RetailerDAO {
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public RetailerBean login(int id, String password) {
		String jpql = "from EmployeeBean where id=:id and password=:pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<RetailerBean> query = manager.createQuery(jpql, RetailerBean.class);//accepts generic whereas query does not//
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
			RetailerBean bean = query.getSingleResult();
			return bean;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public ProductBean searchProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(ProductBean.class, id);
	}

	@Override
	public int register(RetailerBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		}catch(Exception e) {
			e.printStackTrace();

		}
		return -1;
	}

	@Override
	public RetailerBean searchOrders(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(RetailerBean.class, id);
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		RetailerBean ebean = manager.find(RetailerBean.class,id);
		ebean.setPassword(password);
		transaction.commit();
		return true;
	}

}
