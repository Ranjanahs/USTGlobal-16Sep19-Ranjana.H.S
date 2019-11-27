package com.ustglobal.sorting.list;

import java.util.Stack;

public class TestD {
    public static void main(String[] args) {
		
    	Stack<Integer> s=new Stack<Integer>();
    	s.add(12);
    	s.add(23);
    	s.add(45);
    	s.add(55);
    	System.out.println("usng get()-------");
    	for(int i=0;i<s.size();i++) {
    		System.out.println(s.get(i));
    	}
    	int j=s.size();
    	System.out.println("usng pop()---------");
    	for(int i=0;i<j;i++) {
    		System.out.println(s.pop());
    	}
	}
}
