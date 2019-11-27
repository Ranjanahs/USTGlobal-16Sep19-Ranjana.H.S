package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
      public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(45.6);
		a1.add("yash");
		a1.add(true);
		
		ListIterator li=a1.listIterator();
		while(li.hasNext()) {
			Object o=li.next();
			System.out.println(o);
		}
		System.out.println("-----------ulta-----------------");
		
		while(li.hasPrevious()) {
			Object o=li.previous();
			System.out.println(o);
		}
	}
}
