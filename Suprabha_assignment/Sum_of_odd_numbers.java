package com.first_java;

public class Sum_of_odd_numbers {

	public static void main(String[] args) {
		
		int n=0;
		for (int i = 1; i < 100; i++)
		{
			if (i % 2 != 0) 
			{
				n=n+i;
			}
		}
		
		System.out.println(n);

	}

}
