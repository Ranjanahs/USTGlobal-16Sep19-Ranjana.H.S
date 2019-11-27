package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestN {
public static void main(String[] args) {
	LinkedList<Integer> l=new LinkedList<Integer>();
	l.add(12);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(10);//null,diff types to sort r nt allowed
	System.out.println("before sort"+l);//return type of sort-void
	Collections.sort(l);
	System.out.println("aftr sort"+l);
	
	Collections.reverse(l);//return type-ll
	System.out.println("aftr reverse"+l);
	
	Collections.shuffle(l);
	System.out.println("aftr shuffle"+l);
	
	
}
}
