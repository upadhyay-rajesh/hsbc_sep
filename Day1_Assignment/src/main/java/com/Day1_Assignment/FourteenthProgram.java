package com.Day1_Assignment;

public class FourteenthProgram {

	public static void main(String[] args) {
		
		int i=1;
		int sum=0;
		for(i=1;i<=99;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of Odd Integers betwwen 1 to 99 is "+sum);

	}

}
