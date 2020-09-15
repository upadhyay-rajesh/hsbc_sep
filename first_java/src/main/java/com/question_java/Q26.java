package com.question_java;

import java.util.Scanner;
import java.lang.Math;
public class Q26 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("input number to get square of: ");
		float n=s.nextFloat();
		System.out.println("the square is: "+Math.pow(n,2));
	}
}
