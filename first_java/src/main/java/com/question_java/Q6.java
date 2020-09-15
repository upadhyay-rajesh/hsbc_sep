package com.question_java;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("get the number");
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		int i;
		int flag=0;
		for(i=2;i<x-1;i++) {
			if(x%i==0) {
				System.out.println("The number is composite");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("The number is prime");
		}
		

	}

}
