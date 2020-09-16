package com.first_java;

class Parent {
	
	public String a;
	
	Parent () {
		
		a = "parent";
	}
	
	public void test () {
		
		System.out.println("Parent's test()");
	}
}

public class Objects extends Parent {
	
	Objects () {
		
		a = "child";
	}
	
	@Override
	public void test () {
		
		System.out.println("Child's test()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Parent();
		p.test();
		
		Parent cp = new Objects();
		cp.test();
		
		Objects c = new Objects(); 
		c.test();
		
		System.out.println(p.a + " " + cp.a + " " + c.a);
	}

}
