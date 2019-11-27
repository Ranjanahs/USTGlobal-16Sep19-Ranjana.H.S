package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {
public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue();
	pq.add(12);
	pq.add(24);
	//pq.add("hello");
	//pq.add(null);//no null,only generics
	pq.offer(1);
	System.out.println("before poll="+pq);
	System.out.println("---usng iterator---");
	Iterator<Integer> it=pq.iterator();
	while(it.hasNext()) {
		System.out.println(pq.poll());
	}
	System.out.println("after poll "+pq);
	
}
}
