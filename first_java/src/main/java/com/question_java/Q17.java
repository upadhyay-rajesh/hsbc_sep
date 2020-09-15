package com.question_java;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int n=Integer.parseInt(args[0]);
		int i=1,sum=0;
		do {
			sum+=i;
			i+=1;
			
		}while(i<n);
		System.out.println("the sum of numbers is: "+sum);
		}
		catch(Exception e){
			System.out.println("the given input is not a number.");
		}
	}

}
