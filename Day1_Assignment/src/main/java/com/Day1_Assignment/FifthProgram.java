package com.Day1_Assignment;

import java.util.Scanner;

public class FifthProgram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int i=1;
		while(i<=10)
		{
			int x= number * i;
			System.out.println(x);
			i++;
		}
		

	}

}
