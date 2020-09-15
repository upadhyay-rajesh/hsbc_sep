package com.first_java;

public class Cube {

	public static void main(String[] args) {
		System.out.println("Number is : "+args[0]);
		int n = Integer.parseInt(args[0]);
		if((n>10)||(n==0)||(n<0))
			System.out.println("Please enter correct number");
		else
		{
			int cube=n*n*n;
			System.out.println("Cube is :" +cube);
		}

	}

}
