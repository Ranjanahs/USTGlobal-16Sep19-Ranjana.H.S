package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager  = entityManagerfactory.createEntityManager();
    Product productdetail =	entityManager.find(Product.class,102);//find()-used to retrieve data frm db(clsname,value of prikey)
	System.out.println("ID---------"+productdetail.getPid());
	System.out.println("Name-------"+productdetail.getPname());
	System.out.println("Quantity---"+productdetail.getQuantity());
	entityManager.close();
   	}
}
