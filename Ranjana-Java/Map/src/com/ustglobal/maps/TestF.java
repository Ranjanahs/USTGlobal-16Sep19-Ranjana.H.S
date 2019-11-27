package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
public static void main(String[] args) {
	Student s1=new Student(2,"divya",89.2);
	Student s2=new Student(5,"kavya",89.2);
	Student s3=new Student(8,"nithya",89.2);
	Student s4=new Student(4,"radhika",89.2);
	Student s5=new Student(7,"anu",89.2);
	Student s6=new Student(3,"pallu",89.2);
	Student s7=new Student(6,"ashwini",89.2);
	Student s8=new Student(88,"ranjana",89.2);
	Student s9=new Student(89,"anjana",89.2);
	Student s10=new Student(178,"sanjana",89.2);
	Student s11=new Student(10,"laksh",89.2);
	Student s12=new Student(18,"simha",89.2);
	
	ArrayList<Student> al=new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	ArrayList<Student> al1=new ArrayList<>();
	al1.add(s4);
	al1.add(s5);
	al1.add(s6);
	
	ArrayList<Student> al2=new ArrayList<>();
	al2.add(s7);
	al2.add(s8);
	al2.add(s9);
	
	HashMap<String,ArrayList<Student>> hm=new HashMap<>();
	hm.put("first", al);
	hm.put("second",al1);
	hm.put("third", al2);
	
	ArrayList<Student> first = hm.get("second");
	
	Iterator<Student> it=first.iterator();
	while(it.hasNext()) {
		Student s=it.next();
		System.out.println("id="+s.id);
		System.out.println("name="+s.name);
		System.out.println("percentage="+s.percentage);
		System.out.println("-----------------------");
	}
	
	
	
}
}
