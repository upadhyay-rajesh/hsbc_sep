package com.questions;
import java.util.*;
public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=obj.nextInt();
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
        System.out.println("Reverse number is "+rev);
	}

}
/*
Enter a number
123
Reverse number is 321
*/