package com.first_java;

public class Static_demo1 {

	public static void stat1 () {
		
		// call static from static
		stat2();
		
		// create object to call non-static from static
		Static_demo1 sd = new Static_demo1();
		sd.nonstat2();
	}
	
	public static void stat2 () {
		
		System.out.println("in static 2");
	}
	
	public void nonstat1 () {
		
		// call static from non-static directly
		stat2();
		
		// call non static from non-static directly
		nonstat2();
	}

	public void nonstat2 () {
	
		System.out.println("in non-static 2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stat1();
		Static_demo1 s = new Static_demo1();
		s.nonstat1();
	}

}
