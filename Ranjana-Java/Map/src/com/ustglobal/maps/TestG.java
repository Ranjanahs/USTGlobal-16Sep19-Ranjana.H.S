package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
 public static void main(String[] args) {
	Emp e1=new Emp(2,"ranju",450000);
	Emp e2=new Emp(1,"ranj",550000);
	Emp e3=new Emp(4,"kanju",45000);
	Emp e4=new Emp(7,"sanju",50000);
	Emp e5=new Emp(3,"anju",470000);
	Emp e6=new Emp(8,"nju",480000);
	Emp e7=new Emp(3,"anlju",40000);
	Emp e8=new Emp(3,"anjku",70000);
	Emp e9=new Emp(3,"anpju",10000);
	Emp e10=new Emp(3,"anj",4000);
	
	ArrayList<Emp> al=new ArrayList<>();
	al.add(e1);
	al.add(e2);
	al.add(e3);
	
	ArrayList<Emp> al1=new ArrayList<>();
	al1.add(e4);
	al1.add(e5);
	al1.add(e6);
	
	ArrayList<Emp> al2=new ArrayList<>();
	al2.add(e7);
	al2.add(e8);
	al2.add(e9);
	
	HashMap<String,ArrayList<Emp>> hm=new HashMap<>();
	hm.put("first", al);
	hm.put("second",al1);
	hm.put("third", al2);
	
	ArrayList<Emp> first = hm.get("second");
	
	Iterator<Emp> it=first.iterator();
	while(it.hasNext()) {
		Emp e=it.next();
		System.out.println("id="+e.id);
		System.out.println("name="+e.name);
		System.out.println("percentage="+e.salary);
		System.out.println("-----------------------");
	}
	
	
	
	
}
}
