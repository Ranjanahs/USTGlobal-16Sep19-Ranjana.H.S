package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(101,"ankitha",45.55);
		Student s2=new Student(123,"yash",23.2);
		Student s3=new Student(456,"vasuki",89.5);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i=0;i<al.size();i++) {
			Student s=al.get(i);
			System.out.println("id="+s.id);
			System.out.println("name="+s.name);
			System.out.println("percentage="+s.percentage);
		}
		System.out.println("for each");
		for(Student s:al) {
			System.out.println(s);
		}
	}

}
