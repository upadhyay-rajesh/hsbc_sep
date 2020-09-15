package com.question_java;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("get the number to reverse:");
		int x=s.nextInt();
		int rev=0;
		while(x!=0) {
			rev=rev*10;
			rev=rev+x%10;
			x=x/10;
		}
		System.out.println("reversed number is: "+rev);
	}

}
