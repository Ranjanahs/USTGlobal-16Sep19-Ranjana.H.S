package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestC {
	public static void main(String[] args) {
		System.out.println("scanner cls");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();//returns full value.
		String name1=sc.nextLine();//does nt count space.it returns value still space
		System.out.println(name1);
		System.out.println("Name is"+name);
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Age is"+age);
		
		
	}

}
