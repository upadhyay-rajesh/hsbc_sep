package com.Day1_Assignment;

import java.util.Scanner;

public class EleventhProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i;
		int fact=1;
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factroial of a number is "+ fact);

	}

}
