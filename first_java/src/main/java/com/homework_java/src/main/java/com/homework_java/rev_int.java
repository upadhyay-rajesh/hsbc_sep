package com.homework_java;

public class rev_int {

	public static void main(String[] args) {
		int i=91,n;
		double rev=0.0;		
	
		while(i!=0)
		{
			n= i % 10;
		        rev = rev * 10 + n;
		        i /= 10;
		}
		System.out.println("Reversed Number is "+rev);
		

	}

}
