package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestM {
  public static void main(String[] args) {
	ArrayList<Double> a1=new ArrayList<Double>();
	a1.add(34.5);
	a1.add(23.5);
	a1.add(89.2);
	a1.add(12.3);//add elements at last
	a1.add(null);
	a1.add(null);
	System.out.println(a1);
	
	a1.add(2,54.6);
	a1.add(3, 25.2);
	System.out.println("Aftr add in 2nd index "+a1);
	System.out.println("Aftr add in 3nd index "+a1);
	
	a1.remove(0);//remove 1st match
	System.out.println("after removing 0th index "+a1);
	
	a1.remove(null);
	System.out.println("aftr removing null "+a1);
	
	Double val=a1.get(4);
	System.out.println("Object at 4th index "+val);
	
	a1.set(2, 77.6);
	System.out.println("Aftr replacing 2nd index "+a1);
	
	a1.clear();
	System.out.println("afte clearing method "+a1);
	
	boolean res1=a1.contains(54.6);
	System.out.println("reult of contains "+res1);
	
	List<Double> a11=new ArrayList<Double>();
	a11.add(12.3);
	a11.add(23.4);
	a11.add(34.5);
	
	a1.addAll(a11);//all values of a11 ll be copied to a1
	System.out.println("After add all "+a1);
	
	boolean contain=a1.containsAll(a11);
	System.out.println("contains all "+contain);
	
	boolean res=a1.removeAll(a11);
	System.out.println("removed all of a11 "+res);
	System.out.println("aftr removed"+a1);
	
	
}
}
