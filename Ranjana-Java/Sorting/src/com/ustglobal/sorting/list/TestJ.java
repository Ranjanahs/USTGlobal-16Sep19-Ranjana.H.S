package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	public static void main(String[] args) {
		SortByNameCus sb=new SortByNameCus();
		TreeSet<Customer> ts=new TreeSet<Customer>(sb);
		

		Customer b1=new Customer("ranjana",5,67686);
		Customer b2=new Customer("anjana",56,98988);
		Customer b3=new Customer("sanjana",58,4512);
		Customer b4=new Customer("spandana",7,7896);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		System.out.println("--------using iterator-------");
		Iterator<Customer> it=ts.iterator();
		while(it.hasNext()) {
			Customer b=it.next();
			System.out.println("name="+b.name);
			System.out.println("id="+b.id);
			System.out.println("Salary="+b.salary);
			System.out.println("------------------------------");
		}
	}
}
