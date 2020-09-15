package com.question_java;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum1=1;
		int sum2=1;
		int x;
		System.out.print("0 1 1");
		for(i=3;i<=20;i++) {
			x=sum1+sum2;
			sum1=sum2;
			sum2=x;
			System.out.print(" "+x);
		}
	
		
	}

}
