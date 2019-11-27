package com.ustglobal.exception.first;

public class TestB {
     public static void main(String[] args) {
		System.out.println("main starts");
		
		int a=10;
		int b=0;
		
		try {
			b=10/0;
			System.out.println(b);
			System.out.println("hello");
		}catch(ArithmeticException ae){
			System.out.println("number is devided by 0");
		}
		
		System.out.println("main ends");
	}
}

