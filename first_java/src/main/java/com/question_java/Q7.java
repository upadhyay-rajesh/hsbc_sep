package com.question_java;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("numbr of elements");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		int[] x= new int[n];
		int sum=0;
		System.out.println("give the "+n+" elements");
		for(i=0;i<n;i++)
		{
			x[0]=s.nextInt();
			sum+=x[0];
		}
		System.out.println("the average of numbers is: "+(sum/n));

	}

}
