package com.first_java;

abstract class Parent1 {
	
	int num;
	
	Parent1 () {
		
		num = 10;
	}
	
	abstract public void test ();
}

public class Ovrride extends Parent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Cannot instantiate abstract class
		// Parent p = new Parent();
		
		// create object
		Parent1 p = new Ovrride();
		p.test();
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		System.out.println("Implementation of test() in Child");
	}

}
