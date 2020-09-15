package com.first_java;

import java.util.Scanner;

public class A23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input principal, rate and time (space separated) >> ");
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		System.out.println("Simple Interest = " + (p * r * t / 100.0));
		sc.close();
	}

}
