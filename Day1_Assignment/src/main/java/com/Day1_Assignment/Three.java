package com.Day1_Assignment;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int total_marks = scan.nextInt();
		
		if(total_marks>90 && total_marks<100)
			System.out.println("Grade is O");
		else if(total_marks>80 && total_marks<90)
		{
			System.out.println("Grade is E");
		}
		else if(total_marks>70 && total_marks<80)
		{
			System.out.println("Grade is A");
		}
		else if(total_marks>60 && total_marks<70)
		{
			System.out.println("Grade is B");
		}
		else if(total_marks>50 && total_marks<60)
		{
			System.out.println("Grade is C");
		}
		else if(total_marks>40 && total_marks<50)
		{
			System.out.println("Grade is D");
		}
		else 
			System.out.println("Fail....");

	}

}
