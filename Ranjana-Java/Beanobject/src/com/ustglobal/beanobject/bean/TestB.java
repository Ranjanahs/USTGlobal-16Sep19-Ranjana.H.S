package com.ustglobal.beanobject.bean;

public class TestB {
	public static void main(String[] args) {
		
		employee e=new employee();
		e.setId(12);
		e.setName("Vasuki Vaibhav");
		e.setSalary(2200000);
		e.setDept("filmy");
		e.setDesignation("Playback singer");
		
		Database1 db=new Database1();
		db.receive(e);
	  }
	}

