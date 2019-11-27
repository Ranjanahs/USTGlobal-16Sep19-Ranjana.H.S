package com.ustglobal.java8features.function;

import java.util.ArrayList;

public class TestS {
   public static void main(String[] args) {
	
	   ArrayList<Student> al=new ArrayList<Student>();
	   al.add((new Student(5,"vikram",56.7)));
	   al.add((new Student(3,"vijay",52.7)));
	   al.add((new Student(6,"yash",55.7)));
	   al.add((new Student(2,"akshay",6.7)));
	   al.add((new Student(1,"vikra",5.7)));
	   
	   Helper h=new Helper();
	   System.out.println("DISPLAY");
	   h.display(al);
	   System.out.println("FAILED");
	  h.displayFaildstudents(al);
	  System.out.println("PASSED");
	  h.displaypasdstudents(al);
	  System.out.println("TOPPER");
	  h.displaytopperstudent(al);
}
}
