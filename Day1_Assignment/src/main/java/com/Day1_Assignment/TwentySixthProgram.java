package com.Day1_Assignment;

import java.util.Scanner;

public class TwentySixthProgram {

	public static void main(String[] args) {
		Double num;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextDouble();
		Double square = Math.pow(num, 2);
		System.out.println("Square of "+ num + " is: "+ square);

	}

}
