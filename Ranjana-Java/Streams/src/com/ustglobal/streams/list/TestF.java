package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
public static void main(String[] args) {
	ArrayList<Employee> al=new ArrayList<Employee>();
	Employee e1=new Employee(1,"veeru");
	Employee e2=new Employee(4,"veeu");
	Employee e3=new Employee(2,"veer");
	
	Comparator<Employee> cmp=(e4,e5)->{
		return e1.name.compareTo(e5.name);
	};
	
	List<Employee> l=
	al.stream().sorted(cmp).collect(Collectors.toList());
	
	Iterator<Employee> it=l.iterator();
	while(it.hasNext()) {
		Employee e=it.next();
		System.out.println("id="+e.id);
		System.out.println("name="+e.name);
	}
	
}
}
