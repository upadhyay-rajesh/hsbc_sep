package com.first_java;

import java.util.*;
public class Copy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");
		int n= scan.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		//Copy
		for(int j=0;j<n;j++)
		{
			b[j]=a[j];
		}
		
		System.out.println("Contents of another array");
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]+" ");
		}
	}

}
