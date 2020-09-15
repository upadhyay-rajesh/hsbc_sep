package com.first_java;

import java.util.Scanner;

public class A33 {
	
	static double average (int a[]) {
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return ((double)sum / a.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		double avg = average(a);
		System.out.println(avg);
		sc.close();

	}

}
