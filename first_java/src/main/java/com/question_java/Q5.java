package com.question_java;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("input the number to get its table");
		int x=s.nextInt();
		int i;
		System.out.println("the table of number"+x+"is:");
		for(i=1;i<11;i++) {
			System.out.println(x*i);
		}

	}

}
