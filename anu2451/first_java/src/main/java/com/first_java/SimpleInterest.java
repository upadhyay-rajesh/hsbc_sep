package com.first_java;

import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principal,time,rate");
		float p = scan.nextFloat();
		float t = scan.nextFloat();
		float r = scan.nextFloat();
		float si = (p*r*t)/100;
		System.out.println("Simple Interest: "+si);
	}

}
