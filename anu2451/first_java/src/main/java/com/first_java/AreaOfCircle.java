package com.first_java;

public class AreaOfCircle {

	public static void main(String[] args) {
		System.out.println("radius is:"+args[0]);
		float radius = Float.parseFloat(args[0]);
		float area = (22*radius*radius)/7;
		System.out.println("Area of Circle is:"+area);

	}

}
