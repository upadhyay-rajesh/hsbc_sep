package com.question_java;

import java.util.Scanner;

public class Q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("input number of elements:");
		int n=s.nextInt();
		int[] x= new int[n];
		int i;
		System.out.println("input the elements:");
		for(i=0;i<n;i++)
		{
			x[i]=s.nextInt();
		}
		int[] y=new int[n];
		y=x.clone();
		//for(i=0;i<n;i++)
		//{
		//	x[i]+=1;
		//}

		//y=x;
		for(i=0;i<n;i++)
		{
			System.out.print(y[i]+" ");
		}
	
	}

}
