package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestL {
public static void main(String[] args) {
	ArrayList<Teacher> a1=new ArrayList<Teacher>();
	Teacher t1=new Teacher(1,"Annie","Social");
	Teacher t2=new Teacher(2,"Sunitha","Science");
	Teacher t3=new Teacher(3,"Jospine","Kannada");
	
	a1.add(t1);
	a1.add(t2);
	a1.add(t3);
	
	for(int i=0;i<a1.size();i++) {
		Teacher t=a1.get(i);
		System.out.println("tid="+t.tid);
		System.out.println("tname="+t.tname);
		System.out.println("tsubject="+t.tsub);
	}
	
	for (Teacher t : a1) {
		System.out.println(t);
	}
}
}
