package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestI {
public static void main(String[] args) {
	Stack li=new Stack();
	li.add(12);
	li.add(32.2);
	li.add("more");
	li.add(true);
	li.add(null);
	
	System.out.println("usng for loop");
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
	}
	System.out.println("usng for each loop");
	for(Object object : li) {
		System.out.println(object);
	}
	System.out.println("usng iterator");
	Iterator it=li.iterator();
	while(it.hasNext()) {
		Object o=it.next();
		System.out.println(o);
	}
	System.out.println("usng list iterator");
	ListIterator lt=li.listIterator();
	while(lt.hasNext()) {
		Object o=lt.next();
		System.out.println(o);
	}
	System.out.println("list iterator backwrds");
	while(lt.hasPrevious()) {
		Object o=lt.previous();
		System.out.println(o);
	}
  }
}

