package com.homework_java;

public class series {

	public static void main(String[] args) 
	{
		int n=10;
		int x=2;
	int facto=1,i;
	double sum=0.0;
	
	for(i=1;i<=n;i++)
	{
		sum= 1 + ((Math.pow(x, i))/(facto*i));
	}
System.out.print("Sum of series is = " +sum);
	}

}
