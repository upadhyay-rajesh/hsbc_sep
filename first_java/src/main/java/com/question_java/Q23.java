package com.question_java;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("input number of years");
		float n=s.nextFloat();
		System.out.println("input rate of interest");
		float r=s.nextFloat();
		System.out.println("input principal amount");
		float p=s.nextFloat();
		System.out.println("the simple interest is: "+(p+(p*r*n/100)));
	}

}
