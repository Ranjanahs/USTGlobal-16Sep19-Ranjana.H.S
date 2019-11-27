package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
public static void main(String[] args) {
	LinkedHashSet<Double> hs=new LinkedHashSet<Double>();
	hs.add(12.2);
	hs.add(10.5);
	hs.add(200.4);
	hs.add(77.2);
	hs.add(77.0);
	
	System.out.println("----usng for each-----");
	for(Double s:hs) {
		System.out.println(s);
	}
	System.out.println("----usng iterator-----");
	Iterator<Double> it=hs.iterator();
	while(it.hasNext()) {
		Double p=it.next();
		System.out.println(p);
	}
	
}
}
