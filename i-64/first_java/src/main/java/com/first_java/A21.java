package com.first_java;

import java.util.Scanner;

public class A21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter the dimensions followed by the matrices >> ");
		
//		int n = sc.nextInt();
//		int m = sc.nextInt();
		int a[][] = new int[3][3];
//		int b[][] = new int[n][m];
//		int ans[][] = new int[n][m];
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				a[i][j] = sc.nextInt();
			}
		}
		
		int ans = a[0][0] * ((a[1][1]*a[2][2]) - (a[2][1]*a[1][2])) -a[0][1] * (a[1][0] * a[2][2] - a[2][0] * a[1][2]) + a[0][2] * (a[1][0] * a[2][1] - a[2][0] * a[1][1]);
		
		System.out.println(ans);
		
		sc.close();
	}

}

