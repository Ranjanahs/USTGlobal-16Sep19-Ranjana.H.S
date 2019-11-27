package com.ustglobal.beanobject.bean;

public class Student {
	
        private int id;
        private String name;
        private int rollno;
        
//        public Student(int id, String name, int rollno) {
//			super();
//			this.id = id;
//			this.name = name;
//			this.rollno = rollno;
//		}
        
        public void setId(int id) {
        	this.id=id;
        }
        public int getId() {
        	return id;
        }
        public void setName(String name) {
        	this.name=name;
        }
        public String getName() {
        	return name;
        }
        public void setRollno(int rollno) {
        	this.rollno=rollno;
        }
        public int getRollno() {
        	return rollno;
        }
		
}
