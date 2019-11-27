package com.ustglobal.hasarelation.weak2;

public class TestA {
	public static void main(String[] args) {
		Car c=new Car();
		System.out.println("Car name is "+c.name);
		c.run();
		c.playMusic();
		c.m.song();
	}

}
