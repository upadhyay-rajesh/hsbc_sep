package com.first_java;

import java.util.*;
public class Compound_Interest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter P,R,T");
		double p = scan.nextDouble();
		double r = scan.nextDouble();
		double t = scan.nextDouble();
		double ci = p*(Math.pow((1+(r/100)),t))-p;
		System.out.println("CompoundInterest is :"+ci);
	}

}
