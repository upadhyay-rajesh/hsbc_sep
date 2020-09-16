package com.questions;
import java.util.*;
public class Ques7 {

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
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		
		}
		float avg=sum/n;
		System.out.println("Average of all values is "+avg);
	}

}

/*
Enter the size of array
5
Enter the values
1
9
55
3
3
Average of all values is 14.0
*/