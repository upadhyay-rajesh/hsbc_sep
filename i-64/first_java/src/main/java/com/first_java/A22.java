package com.first_java;

import java.util.Scanner;

public class A22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the dimensions followed by the matrices >> ");
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		int b[][] = new int[n][m];
		int ans[][] = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < m; j++) {
				
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < m; j++) {
				
				b[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < m; j++) {
				
				for (int k = 0; k < n; k++) {
					
					ans[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < m; j++) {
				
				System.out.print(ans[i][j] + " ");
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}

//= a[0][0] * ((a[1][1]*a[2][2]) - (a[2][1]*a[1][2])) -a[0][1] * (a[1][0] * a[2][2] - a[2][0] * a[1][2]) + a[0][2] * (a[1][0] * a[2][1] - a[2][0] * a[1][1]);
