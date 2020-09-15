package com.questions;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=obj.nextInt();
		double ans=0;
		int flag=0;
		if(n==1||n==2)
		{
			System.out.println("Number is not prime.");
		}
		else
		{
		for(int i=2;i<n;i++)
		{
			
			if(n%i==0)
			{
				System.out.println("Number is not prime.");
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		{
			System.out.println("Number is prime.");
			
		}
		
		flag=0;
	}
	}

}

/*
Enter a number
153
Number is not prime.

*/