package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
 public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(34);
	ts.add(45);
	ts.add(12);
	ts.add(5);
	ts.add(39);
	//ts.add("deep");//cls cast excp
	ts.add(null);//only respctve datatype-thy r generics,null nt allowd.null pointr excp
	
	System.out.println("-------usng for each----");
	for(Object s:ts) {
		System.out.println(s);
	}
	System.out.println("------usng iterator------");
	Iterator it=ts.iterator();
	while(it.hasNext()) {
		Object p=it.next();
		System.out.println(p);
	}
}
}
