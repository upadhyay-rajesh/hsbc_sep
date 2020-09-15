package com.first_java;

import java.util.Scanner;

public class sum_of_n_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num1=0;
		
		if(in.hasNextInt())
		{
			num=in.nextInt();
			for(int i=0;i<=num;i++)
			{
				
				num1=num1+i;
			
			}
			System.out.println(num1);
			
		}
		else
		{
			System.out.println("not int");
		}
		


	}

}
