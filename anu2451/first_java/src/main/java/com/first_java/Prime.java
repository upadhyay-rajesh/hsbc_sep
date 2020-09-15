package com.first_java;

public class Prime {

	public static void main(String[] args) {
		System.out.println("Number to be Checked is:"+args[0]);
		int number = Integer.parseInt(args[0]);
		int c=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
				c++;
		}
		if(c==2)
		{
			System.out.println("Prime");
		}
		else 
			System.out.println("Not a Prime Number");
	}

}
