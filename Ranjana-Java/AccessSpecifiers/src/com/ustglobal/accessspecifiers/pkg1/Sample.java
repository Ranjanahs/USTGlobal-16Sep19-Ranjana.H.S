package com.ustglobal.accessspecifiers.pkg1;

import com.ustglobal.accessspecifiers.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		Demo d=new Demo();
//		System.out.println(d.a); d.add()//private cannot be accessed
		Sample s=new Sample();
		
//		System.out.println(d.b);
//		d.sub();//default cannot be accessed
		
		
		
		System.out.println(s.c);
		s.mul();//protected
		
		
		
		System.out.println(d.name);
		d.div();//public
	} 

}
