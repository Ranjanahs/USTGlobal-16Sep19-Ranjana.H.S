package com.ustglobal.exception.customiseuncheckedexception;

public class TestAge {
	public static void main(String[] args) {
		System.out.println("main started");
		Validator v=new Validator();
		try {
		v.verify(12);
		}catch(Invalidageexception ie) {
			System.out.println("exception occured");
		}
		v.verify(13);
		System.out.println("main ended");
	}

}
