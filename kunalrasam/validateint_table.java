package com.first_java;

import java.util.Scanner;

public class validateint_table {

	public static void main(String[] args) {
		
		int num;
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num1=0;
		
		if(in.hasNextInt())
		{
			num=in.nextInt();
			for(int i=0;i<=10;i++)
			{
				System.out.println(num1);
				num1=num1+num;
			
			}
			
		}
		else
		{
			System.out.println("not int");
		}
		

	}

}
