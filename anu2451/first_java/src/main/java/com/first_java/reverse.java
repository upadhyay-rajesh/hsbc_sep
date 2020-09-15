package com.first_java;

public class reverse {

	public static void main(String[] args) {
		System.out.println("Number is:"+args[0]);
		int rev=0,rem;
		int n = Integer.parseInt(args[0]);
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse is:"+rev);

	}

}
