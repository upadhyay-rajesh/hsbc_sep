package com.first_java;

public class Factorial {
	
	public static void main(String[] args)
	{
		System.out.println("Number is:"+args[0]);
		int n = Integer.parseInt(args[0]);
		int p=1;
		for(int i = n;i>=1;i--)
		{
			p=p*i;
		}
		System.out.println("Factorial is:"+p);
	}
}
