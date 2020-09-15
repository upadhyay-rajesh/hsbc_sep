package com.first_java;
import java.util.*;
public class Average {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total count of number present:"+args[0]);
		int n = Integer.parseInt(args[0]);
		int a[]= new int[n];
		int s=0,avg=0;
		System.out.println("enter numbers");
		for(int i=0;i<n;i++)
		{
			a[i] = scan.nextInt();
			s=s+a[i];
		}
		avg=s/n;
		System.out.println("Average is:"+avg);
		
	}

}
