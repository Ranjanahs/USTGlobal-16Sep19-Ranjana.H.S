package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestD {
	public static void main(String[] args) {
		
	ArrayList<Integer> marks=new ArrayList<Integer>();
	marks.add(70);
	marks.add(25);
	marks.add(35);
	marks.add(30);
    marks.add(90);
	marks.add(45);
	
	Comparator<Integer> cmp=(m1,m2)->{
		if(m1<m2) {
			return 1;
		}else if(m1<m2){
			return -1;
			}else {
			return 0;
		}
	};
	long nofailedStudents=
			marks.stream().filter(i -> i<40).count();
			System.out.println(nofailedStudents);
			System.out.println("---------------------");
           Integer i=marks.stream().min(cmp).get();
           System.out.println("minValue="+i);
           System.out.println("------------------------");
           Integer i1=marks.stream().max(cmp).get();
           System.out.println("maxValue="+i1);
}
}
