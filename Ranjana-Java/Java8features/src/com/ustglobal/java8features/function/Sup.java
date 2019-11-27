package com.ustglobal.java8features.function;

public class Sup {
 public Object test() {
	 return new Integer(10);
 }
}
class Sub extends Sup{
	@Override
	public Integer test() {
		return new Integer(10);
	}
}