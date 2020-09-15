package com.first_java;

import java.util.*;
public class Ascending {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int temp;
		System.out.println("Enter total number of elements present");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("enter numbers");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int l=0;l<n;l++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After Sorting in ascending order");
		for(int k=0;k<n;k++)
		{
			System.out.print(a[k]+" ");
		}
	}

}
