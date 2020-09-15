package com.first_java;

public class SumOfOddIntegers {

	public static void main(String[] args) {
		int i,s=0;
		for(i=1;i<=99;i++)
		{
			if(i%2==0)
				continue;
			else
				s=s+i;
		}
		System.out.println("Sum of odd integers: "+s);

	}

}
