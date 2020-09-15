package com.first_java;

import java.util.Scanner;

public class anotherfunctionaverage {
	
	static void average(int[] a,int len)
	{
		int sum=0;
		   for(int i = 0; i < len ; i++)
	        {
	            
	            sum = sum + a[i];
	        }
		   System.out.println("Sum:"+sum);
	       float  avera = (float)sum / len;
	       System.out.println("Average:"+avera);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int len;
		System.out.print("enter length of array");
		Scanner in=new Scanner(System.in);
		len=in.nextInt();
		int a[]=new int[len];
		for(int i=0;i<len;i++)
		{
			a[i]=in.nextInt();
		}
		
		average(a,len);
		
		

	}

	

}
