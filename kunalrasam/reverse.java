package com.first_java;

import java.util.Scanner;

public class reverse {
	
	public static void main(String args[])
	{
		int num;
		System.out.println("enter number you wanted to reverse");
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println(rev);
		
	}

}
