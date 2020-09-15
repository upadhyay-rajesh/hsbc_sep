package com.questions;

import java.util.Scanner;

public class Ques31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter rows and columns: ");
		int row=obj.nextInt();
		int col=obj.nextInt();
		
		int mat1[][]=new int[row][col];
		int mat2[][]=new int[row][col];
		int ans[][]=new int[row][col];
		
		System.out.println("Enter 1st matrix:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat1[i][j]=obj.nextInt();
			}
		}
		System.out.println("Enter 2nd matrix:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat2[i][j]=obj.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				ans[i][j]=mat1[i][j]-mat2[i][j];
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();;
		
		System.out.println("Subtract:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
/*
 Enter rows and columns: 
3 3
Enter 1st matrix:
1 8 6 2 4 9 35 5 2
Enter 2nd matrix:
1 2 3 5 8 3 9 33 0

1 8 6 
2 4 9 
35 5 2 

1 2 3 
5 8 3 
9 33 0 

Subtract:
0 6 3 
-3 -4 6 
26 -28 2 
*/
