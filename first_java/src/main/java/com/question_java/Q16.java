package com.question_java;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int x= Integer.parseInt(args[0]);
		int i;
		System.out.println("the table is: ");
		for(i=1;i<11;i++) {
			System.out.println(x*i);
		}
		}
		catch(Exception e) {
		
		System.out.println("the given input is not integer");
		}
		

	}

}
