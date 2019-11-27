package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestO {
 public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("girija");
	a1.add("vanaja");
	a1.add("jalaja");
	a1.add("kiran");
	System.out.println("before sort"+a1);
	Collections.sort(a1);
	System.out.println("aftr sort"+a1);
	
	
}
}
