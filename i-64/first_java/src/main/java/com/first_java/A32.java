package com.first_java;

import java.util.Scanner;

public class A32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		for (int i = 0; i < b.length; i++)
			System.out.println(b[i]);
		sc.close();

	}

}
