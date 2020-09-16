package com.first_java;

public class Static_demo2 {
	
	public static void stat () {
		
		// call static method from static method of another class using class name
		Static_demo1.stat2();
		
		// create object to call non-static method of another class
		Static_demo1 sd1 = new Static_demo1();
		sd1.nonstat2();
	}
	
	public void nonstat () {
		
		Static_demo1.stat2();
		Static_demo1 sd1 = new Static_demo1();
		sd1.nonstat2();
	}
	
	public static void main (String args[]) {
		
		stat();
		Static_demo2 sd2 = new Static_demo2();
		sd2.nonstat();
	}

}
