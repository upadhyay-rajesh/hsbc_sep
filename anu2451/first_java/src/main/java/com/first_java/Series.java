package com.first_java;

import java.util.*;
public class Series {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter x");
		double x = scan.nextDouble();
		System.out.println("enter n");
		int n = scan.nextInt();
		double s=1;
		for(double i=1;i<=n;i++)
		{
			double p=1;
			for(double j=i;j>=1;j--)
			{
				p=p*j;
			}
			s=s+(Math.pow(x,i)/p);
		}
		System.out.println("Sum of series is:"+s);
	}

}
