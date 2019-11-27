package com.ustglobal.exception.customisecheckedexception;

public class TestAmount {
 public static void main(String[] args) {
	System.out.println("main strts");
	ValidateAmount va=new ValidateAmount();
	try {
		va.checkAmount(50000);
		System.out.println("withdraw cash");
	} catch (InvalidAmountException e) {
		System.err.println(e.getMessage());
	}
	
	System.out.println("main ends");
}
}
