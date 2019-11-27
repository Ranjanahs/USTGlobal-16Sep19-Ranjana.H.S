package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
public static void main(String[] args) {
	SortByName sb=new SortByName();
	TreeSet<Bank> ts=new TreeSet<Bank>(sb);
	SortByPincode sp=new SortByPincode();
	TreeSet<Bank> ts1 = new TreeSet<Bank>(sp);
	SortByMicr sm=new SortByMicr();
	TreeSet<Bank> ts2 = new TreeSet<Bank>(sm);

	Bank b1=new Bank("HDFC",560068,6768689);
	Bank b2=new Bank("SBI",560071,98988898);
	Bank b3=new Bank("CITI",589024,45123640);
	Bank b4=new Bank("CANARA",789564,7896321);
	
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	
	System.out.println("--------using iterator-------");
	Iterator<Bank> it=ts.iterator();
	while(it.hasNext()) {
		Bank b=it.next();
		System.out.println("name="+b.name);
		System.out.println("Pincode="+b.pincode);
		System.out.println("MICR="+b.micr);
		System.out.println("------------------------------");
	}
}
}
