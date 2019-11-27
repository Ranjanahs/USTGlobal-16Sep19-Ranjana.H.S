package com.ustglobal.exception.customiseuncheckedexception;

public class Validator {
	void verify(int age) {
		if(age<18) {
			throw new Invalidageexception("try again nxt tme!!!");
		}
	}

}
