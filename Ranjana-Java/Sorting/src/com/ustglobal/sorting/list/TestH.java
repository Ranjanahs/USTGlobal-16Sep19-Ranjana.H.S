package com.ustglobal.sorting.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestH {
	public static void main(String[] args) {
	    TreeSet<Employee> hs=new TreeSet<Employee>();
	   Employee e1=new Employee(12,"sweety",450000);
	   Employee e2=new Employee(13,"teju",50000);
	   Employee e3=new Employee(14,"siri",45600);
	   Employee e4=new Employee(15,"varsha",52000);
	   Employee e5=new Employee(15,"varsha",52000);
	   
	  hs.add(e1); 
	  hs.add(e2);
	  hs.add(e3);
	  hs.add(e4);
	  hs.add(e5);
	  
	  System.out.println("using iterator");
	  Iterator<Employee> it=hs.iterator();
	  while(it.hasNext()) {
		  Employee e=it.next();
		  System.out.println("eid="+e.id);
		  System.out.println("ename="+e.name);
		  System.out.println("esalary="+e.Salary);
	  }
		}
	}


