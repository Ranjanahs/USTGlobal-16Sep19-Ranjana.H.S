package com.ustglobal.typecasting.reference;

public class TestA {
public static void main(String[] args) {
	Pen p=new Pen();
	p.write();
	Pen p1=new Marker();//upcasting
	System.out.println(p1.cost);
	p1.write();
//	System.out.println(p.size);not possible
//	p.color();                  not possible
	Marker m=(Marker) p1;//downcasting
	m.color();
	m.write();
}
}
