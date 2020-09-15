package com.Day1_Assignment;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=Integer.parseInt(args[0]);
		System.out.println("number one is : "+a);
		b=Integer.parseInt(args[1]);
		System.out.println("number two is : "+b);
		c=a+b;
		System.out.println("Addition of two numbers is : "+c);

	}

}
