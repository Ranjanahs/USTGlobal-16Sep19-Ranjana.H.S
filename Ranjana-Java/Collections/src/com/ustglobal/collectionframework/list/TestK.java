package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestK {
  public static void main(String[] args) {
	ArrayList<Employee> a1=new ArrayList<Employee>();
	Employee e1=new Employee(1,"simha",123000);
	Employee e2=new Employee(2,"lakshmi",92000);
	Employee e3=new Employee(3,"kaushik",500000);
	
	a1.add(e1);
	a1.add(e2);
	a1.add(e3);
	
	for(int i=0;i<a1.size();i++) {
		Employee e=a1.get(i);
		System.out.println("id="+e.eid);
		System.out.println("name="+e.ename);
		System.out.println("salary="+e.esalary);
	}
	
     for (Employee e : a1) {
		System.out.println(e);
	}	
}
}
