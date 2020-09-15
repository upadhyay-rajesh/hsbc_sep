package com.question_java;

import java.util.Scanner;
import java.lang.Math;
public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("input number of years");
		float n=s.nextFloat();
		System.out.println("input rate of interest");
		float r=s.nextFloat();
		System.out.println("input principal amount");
		float p=s.nextFloat();
		System.out.println("the compound interest is: "+(p*Math.pow((1+r/100),n )));
	}

}
