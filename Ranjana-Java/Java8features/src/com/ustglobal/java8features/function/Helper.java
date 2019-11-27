package com.ustglobal.java8features.function;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	
 Comparator<Student> cmp=(s1,s2)->{
	 if(s1.percentage>s2.percentage) {
		 return 1;
	 }else if(s1.percentage<s2.percentage){
		 return -1;
	 }else {
		 return 0;
	 }
 };
	
	void display(ArrayList<Student> al) {
	 Iterator<Student> it=al.iterator();
	 while(it.hasNext()) {
		 Student s=it.next();
		 System.out.println("id="+s.id);
		 System.out.println("name="+s.name);
		 System.out.println("percentage="+s.percentage);
		 System.out.println("---------------------");
		 
	 }
 }
 void displayFaildstudents(ArrayList<Student> al) {
	 List<Student> l=
			 al.stream().filter(stu->stu.percentage<40).
			 collect(Collectors.toList());
	 Iterator<Student> it=l.iterator();
	 while(it.hasNext()) {
		 Student s=it.next();
		 System.out.println("id="+s.id);
		 System.out.println("name="+s.name);
		 System.out.println("percentage="+s.percentage);
		 System.out.println("---------------------");
	 }
 }
	 
	 	 void displaypasdstudents(ArrayList<Student> al) {
		 List<Student> l1=
				 al.stream().filter(stu->stu.percentage>=40).
				 collect(Collectors.toList());
		 Iterator<Student> it=l1.iterator();
		 while(it.hasNext()) {
			 Student s=it.next();
			 System.out.println("id="+s.id);
			 System.out.println("name="+s.name);
			 System.out.println("percentage="+s.percentage);
			 System.out.println("---------------------");
			 
		 }
	        
 }
	 	 
	 	void displaytopperstudent(ArrayList<Student> al) {
	 		 Student l2=
	 				 al.stream().max(cmp).get();
	 				 
	 		     System.out.println("id="+l2.id);
	 			 System.out.println("name="+l2.name);
	 			 System.out.println("percentage="+l2.percentage);
	 			 System.out.println("---------------------");
	 			 
	 		 }
 }


 
