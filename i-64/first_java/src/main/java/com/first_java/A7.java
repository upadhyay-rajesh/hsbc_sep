package com.first_java;
import java.util.*;

public class A7 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		
		double d = ((double) sum) / n;
		
		System.out.println(d);
		sc.close();
	}
}
