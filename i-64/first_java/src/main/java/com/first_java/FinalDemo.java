package com.first_java;

public class FinalDemo {

	final static double PI = 2 * Math.acos(0.0);
	
	public final void test () {
		
		System.out.println("test");
	}

	public void test1 () {
		
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PI);
	}

}

class Child extends FinalDemo {
	
	/*@Override
	public void test () {
		
		System.out.println("changed");
	}*/
	
	@Override
	public final void test1 () {
		
		System.out.println("changed");
	}
}
