package com.ustglobal.typecasting.primitive;

public class TestA {
     public static void main(String[] args) {
		
    	 byte a=10;
		int b=a;    //implicit casting
	    System.out.println("b="+b);
	    
	    int p=20;
	    double q=p;
	    System.out.println("q="+q);
	    System.out.println("---------------");
	    
	    double x=65.0;
	    int y=(int)x;     //explicit casting
	    System.out.println("y="+y);
	    byte z=(byte)x;
	    System.out.println("z="+z);
	    char r=(char)x;
	    System.out.println("r="+r);
	    
	}
}
