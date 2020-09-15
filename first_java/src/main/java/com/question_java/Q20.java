package com.question_java;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("input number of integers: ");
		int n=s.nextInt();
		int[] x= new int[n];
		int i;
		System.out.println("input the ");
		for(i=0;i<n;i++) {
			x[i]=s.nextInt();
		}
		//sort
		int j,temp;
		
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(x[j]<x[i]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
			
		}
		for(i=0;i<n;i++) {
			System.out.println(x[i]);
		}
		
	}

}
