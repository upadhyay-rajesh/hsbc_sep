package com.questions;

import java.util.*;

public class Ques18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=obj.nextInt();
		int m=n;
		int rev=0;
		int sum=0;
		while(m!=0)
		{
			int rem=m%10;
			sum=(int) (sum+Math.pow(rem,3));
			m=m/10;
		}
        
	    if(n==sum)
	    {
	    	System.out.println("This is a Armstrong Number.");	    
	    }
	    else
	    {
	    	System.out.println("This is not a Armstrong Number.");    
	    }
	}
}
/*
Enter a number
153
This is a Armstrong Number.
*/