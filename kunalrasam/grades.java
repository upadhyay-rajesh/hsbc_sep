package com.first_java;

public class grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your mark out of 100");
		int sub=Integer.parseInt(args[0]);
		if(sub<=35)
		{
			System.out.println("grade c");
		}
		else if(sub<=70)
		{
			System.out.println("grade b");
		}
		else
		{
			System.out.println("grade a");
		}

	}

}
