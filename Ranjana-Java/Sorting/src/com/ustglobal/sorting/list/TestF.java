package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestF {
public static void main(String[] args) {
	ArrayList<Marker> a1=new ArrayList<Marker>();
	a1.add(new Marker(50,"blue"));
	a1.add(new Marker(70,"red"));
	a1.add(new Marker(80,"green"));
	a1.add(new Marker(40,"black"));
	
	System.out.println("befr sortng");
	display(a1);
	
	SortByPrice sb=new SortByPrice();
	SortByColor sc=new SortByColor();
	Collections.sort(a1,sb);
	Collections.sort(a1,sc);
	
	System.out.println("after sorting---");//
	display(a1);
		
}

private static void display(ArrayList<Marker> a) {
	Iterator<Marker> it=a.iterator();
	while(it.hasNext()) {
		Marker m=it.next();
		System.out.println("Price="+m.price);
		System.out.println("Color="+m.color);
		System.out.println("-------------------");
	}
	
}
}
