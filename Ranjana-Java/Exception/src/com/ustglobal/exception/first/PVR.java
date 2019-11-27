package com.ustglobal.exception.first;

public class PVR {
	void book() {
		System.out.println("book strt");
		try {
			System.out.println(10/0);
			System.out.println("logic fr booking");
			System.out.println("booking confirmed");
		}catch(ArithmeticException ae) {
			System.out.println("booking failed");
			throw ae;
		}
	}

}
