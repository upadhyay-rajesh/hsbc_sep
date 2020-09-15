package com.questions;
import java.util.*;
public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=obj.nextInt();
		int ans=0;
		for(int i=1;i<=10;i++)
		{
			ans=n*i;
			System.out.println(n+"*"+i+"="+ans);
		}

		obj.close();
	}

}

/*
Enter a number
20
20*1=20
20*2=40
20*3=60
20*4=80s
20*5=100
20*6=120
20*7=140
20*8=160
20*9=180
20*10=200
*/