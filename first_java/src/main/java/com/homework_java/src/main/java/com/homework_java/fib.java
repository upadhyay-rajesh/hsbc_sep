package com.homework_java;

public class fib {

	public static void main(String[] args) {
int a=0,b=1,c=0,count=10;

System.out.print(" "+a+" "+b+" ");

	
		for(int i=2;i<count;i++)
		
		{
			c=a+b;	
			if(c>20)
				break;
			System.out.print(" "+c);
		a=b;
		b=c;

		}
	
	
	}
}


