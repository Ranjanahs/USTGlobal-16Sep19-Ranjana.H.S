package com.ustglobal.wrapperclases;

public class TestA {
	public static void main(String[] args) {
		int a=10;
		System.out.println("a is "+a);
		Integer i=a;//boxing or autoboxing
		System.out.println("i is "+i);
		
		Integer x=10;
		Integer z=new Integer(20);
		System.out.println("x is "+x);
		int y=x;//unboxing or auto unboxing
		System.out.println("y is "+y);
		
		int value=Integer.parseInt("123");
		System.out.println("value= "+value);
		
		boolean res=Boolean.parseBoolean("true");
		System.out.println("res= "+res);
		
		//int value=Integer.parseInt("123str");
		System.out.println("value= "+value);//nt possible
		
		//boolean res=Boolean.parseBoolean("true");
		System.out.println("res= "+res);//nt possible
	}
}
