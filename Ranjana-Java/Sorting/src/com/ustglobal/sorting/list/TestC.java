package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {
 public static void main(String[] args) {
	
	 LinkedList<Integer> l=new LinkedList<Integer>();
	 l.add(12);
	 l.add(13);
	 l.add(20);
	 l.add(25);
	 
	 Integer peekElement=l.peek();
	 System.out.println("peek element"+peekElement);
	 Integer peekFirstElement=l.peekFirst();
	 System.out.println("peek First element"+peekFirstElement);
	 Integer peekLastElement=l.peekLast();
	 System.out.println("peek Last element"+peekLastElement);
	 System.out.println("After peek--------"+l);
	 
	 System.out.println("===================================");
	 
	 Integer pollElement=l.poll();
	 System.out.println("poll element"+pollElement);
	 Integer pollFirstElement=l.pollFirst();
	 System.out.println("poll First element"+pollFirstElement);
	 Integer pollLastElement=l.pollLast();
	 System.out.println("poll Last element"+pollLastElement);
	 System.out.println("After poll--------"+l);
	 
	 System.out.println("---------push--------");
	 l.push(25);
	 System.out.println("after push----"+l);
	 Integer p=l.pop();
	 System.out.println(p);
	 System.out.println("After pop-------"+l);
	 
}
}
