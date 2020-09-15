package com.first_java;

import java.util.Scanner;

public class A24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input principal, rate and time (space separated) >> ");
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		double amt = p * Math.pow(1 + r / 100.0, t);
		System.out.println("Simple Interest = " + (amt - p));
		sc.close();
	}

}
