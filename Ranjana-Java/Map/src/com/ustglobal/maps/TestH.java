package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
public static void main(String[] args) {
	Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
	ht.put(101,"ajay");
	ht.put(102, "vijay");
	ht.put(103, "sujay");
	ht.put(104, "vinay");
	ht.put(101, "sri");
	ht.put(228,"ram");
	ht.put(200, "tms");
	//ht.put(null,"john");//null pointr exception
	//ht.put(108,null);null pointr exception
	System.out.println("data"+ht);
	
	
}
}
