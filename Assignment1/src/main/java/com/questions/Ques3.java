package com.questions;
import java.util.*;
public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int marks=0;
		System.out.println("Enter the marks");
		marks=obj.nextInt();
		if(marks>=90 && marks<100)
		{
			System.out.println("Grade: A");
		}
		else if(marks>=70 && marks<80)
		{
			System.out.println("Grade: B");
		}
		else if(marks>=50 && marks<70)
		{
			System.out.println("Grade: C");
		}
		else if(marks>=40 && marks<50)
		{
			System.out.println("Grade: D");
		}
		else
		{
			System.out.println("Grade: E");
		}
		
	}

}
/*
Enter the marks
65
Grade: C
*/