package com.first_java;

public class pattern {

	public static void main(String[] args) {
		int c;
		for(int i=1;i<=7;i++)
		{
			c=0;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c=c+i;
			}
			System.out.println();
		}

	}

}
