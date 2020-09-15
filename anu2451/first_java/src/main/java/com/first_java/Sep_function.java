package com.first_java;

import java.util.*;
public class Sep_function {

	float avg(float a[])
	{
		int l=a.length;float s=0;
		
		for(int i=0;i<l;i++)
			s=s+a[i];
		
		float avg1 = s/l;
		return avg1;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter length of array");
		int n = scan.nextInt();
		float a[] = new float[n];
		System.out.println("enter numbers");
		for(int i=0;i<n;i++)
		{
			a[i] = scan.nextInt();
		}
		Sep_function s = new Sep_function();
		float b=s.avg(a);
		System.out.println("Average:"+b);
	}

}
