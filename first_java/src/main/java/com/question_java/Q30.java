package com.question_java;

import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("input the matrix 1");
		int i,j;
		int[][] x=new int[3][3];
		int[][] y=new int[3][3];
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				x[i][j]=s.nextInt();
				
			}
		}
		System.out.println("input the matrix 2");
		int[][] z=new int[3][3];
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				y[i][j]=s.nextInt();
				z[i][j]=x[i][j]+y[i][j];
				
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(z[i][j]+" ");
			}
			System.out.println();

		}
		
		
		
	}

}
