package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class SortById {

	public static void main(String[] args) {
		 
		 Comparator<Employee> comp = (e1,e2) -> {
			 if(e1.id>e2.id) {
				 return 1;
			 }else if(e1.id<e2.id) {
				 return -1;
			 }else {
				 return 0;
			 }
		 };
		TreeSet<Employee> ts=new TreeSet<Employee>(comp);
		Employee e1=new Employee(4,"niki",5.6);
		Employee e2=new Employee(1,"bhaskar",5.2);
		Employee e3=new Employee(8,"suresh",5.1);
		Employee e4=new Employee(2,"ramesh",4.5);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("----usng iterator------");
		Iterator<Employee> it=ts.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println("name="+e.name);
			System.out.println("id="+e.id);
			System.out.println("height="+e.height);
			
			
		}
	}

}
