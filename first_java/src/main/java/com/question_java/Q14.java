package com.question_java;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum=0;
		for(i=1;i<=99;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("sum of the odd integers is: "+sum);
	}

}
