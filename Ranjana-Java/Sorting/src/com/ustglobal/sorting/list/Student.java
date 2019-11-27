package com.ustglobal.sorting.list;

public class Student implements Comparable<Student> {
	int id;
	String name;
	double percentage;
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
//	@Override
//	public int compareTo(Student s) {
//            if(this.id>s.id) {
//            	return 1;
//            }else if(this.id<s.id) {
//            	return -1;
//            }else {
//            	return 0;
//            }
	//}
	
	@Override
	public int compareTo(Student s) {
		
//		int i=this.id;not allowed to compare.
//		int j=s.id;
		
		Integer i=this.id;
		Integer j=s.id;
		return i.compareTo(j);
		
	}
	
	 public static int compare(int x, int y) {
	        return (x < y) ? -1 : ((x == y) ? 0 : 1);
	    }

			
		
	}
	

