package com.first_java;

public class pattern_28 {

	public static void main(String[] args) {
		int max=4;
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<max;k++)
			{
				System.out.print(" ");
			}
			max=max-1;
			for(int m=i;m>1;m--)
			{
				System.out.print(m);
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				
			}
			System.out.println();
		}

	}

}
