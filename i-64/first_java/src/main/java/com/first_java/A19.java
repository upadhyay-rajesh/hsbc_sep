package com.first_java;

import java.util.Scanner;

public class A19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		int fact[] = new int[n + 1];
		
		fact[0] = 1;
		for (int i = 1; i <= n; i++) {
			fact[i] = i * fact[i - 1];
//			System.out.println(fact[i]);
		}
		double sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += Math.pow(x,  i) / fact[i];
		}
		
		System.out.println(sum);
		sc.close();
	}

}
