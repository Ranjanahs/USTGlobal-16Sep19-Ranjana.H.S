package com.ustglobal.exception.first;

public class TestE {
	public static void main(String[] args) {
		System.out.println("main statrs");
		
		String s = "hi";
		int[] a = {10,20,30};
		int b = 10;
		try {
			 String s1 = s.toUpperCase();
			 System.out.println(s1);
			 System.out.println(a[4]);
			 System.out.println(b/0);
		}catch(NullPointerException npe) {
			System.out.println("dont play wt null");
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("index nt present");
		}catch(ArithmeticException ai) {
			System.out.println("devide by 0");
		}catch(Exception e){         //this exception can handle any type of exception.Hence it shd be writtn at last only.
		  e.printStackTrace();		
		}
		System.out.println("main ends");
	}

}
