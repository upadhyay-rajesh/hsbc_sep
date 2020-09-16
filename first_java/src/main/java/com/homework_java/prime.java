package com.homework_java;

public class prime {

	public static void main(String[] args) {
	System.out.println("Enter a number");
		int i=41, j;
		boolean k=false;
		
		for(j=2; j<=i/2 ;j++)
		{
			if(j%i!=0)
			{
				k=true;
				break;
			}
		}
		if(k==true)
		
	            System.out.println(i + " is a prime number.");
	        else
	            System.out.println(i + " is not a prime number.");
		
		
		

	}
	
}
