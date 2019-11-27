package com.ustglobal.collectionframework.list;

public class example {
   
	void m1() {
		System.out.println("aa");
	}
	    
}
class b extends example{
	void m1() {
		System.out.println("bb");
	}
}
class test{
	public static void main(String[] args) {
		example e=new example();
		e.m1();
		b o=new b();
		o.m1();
	}
}
