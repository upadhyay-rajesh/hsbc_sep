package com.questions;

import java.util.Arrays;
import java.util.Scanner;

public class Ques20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=obj.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the values");
		for(int i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("After Sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
/*
Enter the size of array
5
Enter the values
99 3 101 5 1
After Sorting
1 3 5 99 101 
*/