package com.question_java;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner g = new Scanner(System.in);
		System.out.println("enter the marks");
		int mks = g.nextInt();
		if(mks>90) {System.out.println("grade is A");
			}
		else if(mks>= 80) {
			System.out.println("grade is B");
		}
		
		else if(mks>=70) {
			System.out.println("grade is C");
		}
		
		else if(mks>=60) {
			System.out.println("grade is D");
		}
		
		else {
			System.out.println("failed test");
		}
	
	}

}
