package com.Day1_Assignment;

import java.util.Scanner;

public class TwentyEighthProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<4-i;j++)
			{
				System.out.print(" ");
			} 
			
			for(int k=i;k>=4;k--)
			{
				System.out.print(k);
			}
			
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("\n");
			
			
		}
	
	}

}
