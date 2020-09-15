package com.question_java;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner s=new Scanner(System.in);
		System.out.println("input number of rows and columns in the two matrix:");
		int n=s.nextInt();
		System.out.println("input the matrix 1");
		int i,j;
		int[][] x=new int[n][n];
		int[][] y=new int[n][n];
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				x[i][j]=s.nextInt();
				
			}
		}
		System.out.println("input the matrix 2");
		int[][] z=new int[n][n];
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				y[i][j]=s.nextInt();
				z[i][j]=x[i][j]-y[i][j];
				
			}
		}
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print(z[i][j]+" ");
			}
			System.out.println();

		}
		
		
		
	}

}
