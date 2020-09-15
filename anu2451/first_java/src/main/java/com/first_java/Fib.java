package com.first_java;

public class Fib {

	public static void main(String[] args) {
		int a=1,b=1,c=0;
		System.out.print(a +" "+b);
		while((a+b)<=20)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}
