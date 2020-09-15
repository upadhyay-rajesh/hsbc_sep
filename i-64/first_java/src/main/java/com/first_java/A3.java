package com.first_java;
import java.util.*;

public class A3 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade = 'F';
		if (score >= 80) grade = 'O';
		else if (score >= 70) grade = 'A';
		else if (score >= 60) grade = 'B';
		else if (score >= 50) grade = 'C';
		else if (score >= 40) grade = 'D';
		else grade = 'F';
		System.out.println("Grade = " + grade);
		sc.close();
	}
}
