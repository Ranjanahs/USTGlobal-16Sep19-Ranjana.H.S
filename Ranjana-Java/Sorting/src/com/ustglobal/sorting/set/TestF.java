package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
public static void main(String[] args) {
	TreeSet<String> hs=new TreeSet<String>();
	hs.add("vijay");
	hs.add("vinay");
	hs.add("sujay");
	hs.add("dvijay");
	hs.add("ajay");
	
	System.out.println("----usng for each-----");
	for(String s:hs) {
		System.out.println(s);
	}
	System.out.println("----usng iterator-----");
	Iterator<String> it=hs.iterator();
	while(it.hasNext()) {
		String p=it.next();
		System.out.println(p);
	}
	
}
}
