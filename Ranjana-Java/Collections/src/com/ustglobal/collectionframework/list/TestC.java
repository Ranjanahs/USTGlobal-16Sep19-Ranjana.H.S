package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
  public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(23);
	a1.add(98.7);
	a1.add(true);
	a1.add("gd evng");
	
	Iterator i1=a1.iterator();
	Object o1=i1.next();
	System.out.println("obj="+o1);
	
	Object o2=i1.next();
	System.out.println("obj="+o2);
	
	Object o3=i1.next();
	System.out.println("obj="+o3);
	
	Object o4=i1.next();
	System.out.println("obj="+o4);
	
	boolean b=i1.hasNext();
	System.out.println("obj="+b);
	
	Object o5=i1.next();
	System.out.println("obj="+o5);
	
	System.out.println("======using for loop=======");
	
	for(int i11=0;i11<a1.size();i11++) {
		Object o=a1.get(i11);
		System.out.println(o);
	}
	ArrayList a11=new ArrayList();
	a11.add(12);
	a11.add(233.0);
	a11.add("momo");
	a11.add(false);
	
	System.out.println("======using iterator======");
	
	Iterator i11=a11.iterator();
    while(i11.hasNext()) {
    	Object o=i11.next();
    	System.out.println(o);
    }
    
    System.out.println("==========using for loop=======");
	for(;i1.hasNext();) {
		Object ob=i1.next();
		System.out.println(ob);
	}
	for(int i=0;i<4;i++) {
		Object o = a1.get(i);
		System.out.println(o);
	}
}
}
