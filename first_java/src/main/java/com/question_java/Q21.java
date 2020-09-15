package com.question_java;
import java.util.*;
public class Q21 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("input the matrix");
		int i,j;
		int[][] x=new int[3][3];
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				x[i][j]=s.nextInt();
				
			}
		}
		int sum;
		sum=x[0][0]*(x[1][1]*x[2][2] - x[2][1]*x[1][2]);
		sum-=x[0][1]*(x[1][0]*x[2][2]-x[2][0]*x[1][2]);
		sum+=x[0][2]*(x[1][0]*x[2][1]-x[2][0]*x[1][1]);
		System.out.println("the determinant of the matrix is: "+sum);
	}
}
