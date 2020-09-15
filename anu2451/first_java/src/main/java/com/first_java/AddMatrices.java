package com.first_java;

import java.util.*;
public class AddMatrices {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of rows and columns");
		int r = scan.nextInt();
		int c = scan.nextInt();
		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		int d[][] = new int[r][c];
		System.out.println("enter first matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=scan.nextInt();
			}
			
		}
		System.out.println("enter second matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=scan.nextInt();
			}
		
		}
		System.out.println("Sum of two matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				d[i][j]=a[i][j]+b[i][j];
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}

}
