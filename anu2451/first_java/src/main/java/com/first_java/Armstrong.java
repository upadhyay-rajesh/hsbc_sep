package com.first_java;

import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number to be checked");
		int n = scan.nextInt();
		int n1,sum=0,rem;n1=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(sum==n1)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an armstrong number");

	}

}
