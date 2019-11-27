package com.ustglobal.thread.defining;

public class TestThread {
public static void main(String[] args) {
	System.out.println("main started");
	MyThread t1 = new MyThread();
		/*
		 * //run();-never call run method,it behaves like normal method.
		 * All code will be executed inside main thread only.
		 */
	t1.start();
	//t1.start();IllegalStartException
	for(int i=0;i<10;i++)
	System.out.println("main thread executed");
	System.out.println("main ends");
}
}
