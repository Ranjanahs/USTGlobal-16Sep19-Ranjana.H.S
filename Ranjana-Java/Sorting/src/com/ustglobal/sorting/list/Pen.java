package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen>{
 double price;
 String Brand;
public Pen(double price, String brand) {
	super();
	this.price = price;
	Brand = brand;
}
 @Override
	public int compareTo(Pen p) {
	 if(this.price>p.price) {
     	return 1;
     }else if(this.price<p.price) {
     	return -1;
     }else {
     	return 0;
     }
		
	}
 
 
}
