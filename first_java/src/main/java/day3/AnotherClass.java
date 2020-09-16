package day3;

import day2.Static_Demo;

public class AnotherClass {
	
	
	void add1() {
		//calling non static method of one class inside another non static of different class via object
		Static_Demo s=new Static_Demo();
		s.add();
		
		//calling static method of one class inside another non static of different class via classname
		Static_Demo.sub();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Demo s=new Static_Demo();
		s.add();
		
		Static_Demo.sub();

	}

}
