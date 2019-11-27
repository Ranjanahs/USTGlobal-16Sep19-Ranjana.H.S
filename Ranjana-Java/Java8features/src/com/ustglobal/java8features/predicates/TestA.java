package com.ustglobal.java8features.predicates;

import java.util.function.Predicate;

import com.ustglobal.java8features.Student;

public class TestA {
	public static void main(String[] args) {
		Predicate<Employee> p = s ->{
			if(s.salary>=4000) {
				return true;
			}else {
				return false;
			}
		};
		Employee s=new Employee(1,"anup",4500);
		boolean res=p.test(s);
		System.out.println("result="+res);
		
		
	}
}
