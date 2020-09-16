package com.questions;


public class Ques17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of array");
		int n=Integer.parseInt(args[0]);
		int arr[]=new int[n+1];
		System.out.println("Enter the values");
		int i=0,j=0,k=1;
		while(i<n)
		{
			arr[i]=Integer.parseInt(args[k]);
			System.out.print(args[k]+" ");
			i++;
			k++;
		}
		int sum=0;
		do {
			sum=sum+arr[j];
		    j++;
		}while(j<n);
		System.out.println("Sum: "+sum);
	}

}
/*
 Enter the size of array
Enter the values
1 2 3 4 5
Sum: 15

*/