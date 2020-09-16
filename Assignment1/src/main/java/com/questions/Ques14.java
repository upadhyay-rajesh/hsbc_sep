package com.questions;

public class Ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ans=0;
		System.out.println("The odd numbers between 1 nad 99 are");
		for(int i=1;i<100;i++)
		{
			ans=i%2;
			if(ans!=0)
			{
				System.out.println(i);
			}
			
		}
		
	}

}
