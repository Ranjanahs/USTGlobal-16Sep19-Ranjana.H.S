package com.ustglobal.java8features.function;

import java.util.function.Consumer;

public class TestF {
  public static void main(String[] args) {
	Consumer<Student> c=s->{
		System.out.println("id="+s.id);
		System.out.println("name="+s.name);
		System.out.println("percentage="+s.percentage);
		System.out.println("-------------------------");
	    	
	};
	
	Student s1=new Student(2,"bhavani",78.6);
	c.accept(s1);
	
	
   }
}
