package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {
public static void main(String[] args) {
	ArrayList<Pen> a1=new ArrayList<Pen>();
	Pen p1=new Pen(12,"renolds");
	Pen p2=new Pen(13,"cello");
	Pen p3=new Pen(14,"writometer");
	Pen p4=new Pen(15,"pentonic");
	
	a1.add(p1);
	a1.add(p2);
	a1.add(p3);
	a1.add(p4);
	showPenDetails(a1);
	Collections.sort(a1);
	System.out.println("----------aftr sorting----------");
	showPenDetails(a1);
}
    static void showPenDetails(ArrayList<Pen> a1) {
    	Iterator<Pen> it=a1.iterator();
    	while(it.hasNext()) {
    	Pen p=it.next();
        System.out.println("price is="+p.price);
        System.out.println("brand is="+p.Brand);
        System.out.println("---------------------------------");
   	}
    	
    }
			
}

