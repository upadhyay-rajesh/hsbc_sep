package com.questions;

import java.util.Scanner;

public class Ques11 {

	int factorial(int n)
	{
		
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques11 q=new Ques11();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=obj.nextInt();
		System.out.println("Factorial of number "+n+": "+q.factorial(n));
	}

}

/*
Enter a number
5
Factorial of number 5: 120
*/