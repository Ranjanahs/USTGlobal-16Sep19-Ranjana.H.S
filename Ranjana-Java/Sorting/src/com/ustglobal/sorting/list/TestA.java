package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
public static void main(String[] args) {
	ArrayList<Student> a1=new ArrayList<Student>();
	
	Student s1=new Student(12,"Dimple",35.6);
	Student s2=new Student(13,"sweety",63.2);
	Student s3=new Student(14,"Jimmu",68.4);
	Student s4=new Student(15,"tummy",79.2);
	
	a1.add(s1);
	a1.add(s2);
	a1.add(s3);
	a1.add(s4);
	showStudentDetails(a1);
	Collections.sort(a1);
	System.out.println("----------aftr sorting----------");
	showStudentDetails(a1);
}
    static void showStudentDetails(ArrayList<Student> a1) {
    	Iterator<Student> it=a1.iterator();
    	while(it.hasNext()) {
    	Student s=it.next();
        System.out.println("id is="+s.id);
        System.out.println("name is="+s.name);
        System.out.println("percentage is="+s.percentage);
        System.out.println("---------------------------------");
   	}
    	
    }
}
