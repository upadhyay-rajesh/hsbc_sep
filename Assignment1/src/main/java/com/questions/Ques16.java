package com.questions;

import java.util.Scanner;

public class Ques16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number");
		int n=Integer.parseInt(args[0]);
		int ans=0;
		for(int i=1;i<=10;i++)
		{
			ans=n*i;
			System.out.println(n+"*"+i+"="+ans);
		}

		
	}

}

/*
Enter a number
25*1=25
25*2=50
25*3=75
25*4=100
25*5=125
25*6=150
25*7=175
25*8=200
25*9=225
25*10=250
*/