package com.ustglobal.accessspecifiers.pkg2;

public class Run {
public static void main(String[] args) {
	Demo d=new Demo();
//	System.out.println(d.a); d.add()//private cannot be accessed
	
	System.out.println(d.b);
	d.sub();//default can be accessed
	
	System.out.println(d.c);
	d.mul();//protected
	
	System.out.println(d.name);
	d.div();//public
} 
}
