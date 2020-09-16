package com.questions;

import java.util.Scanner;

public class Ques13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a radius");
		double r=obj.nextDouble();
		System.out.println("The area of circle: "+(Math.PI*Math.pow(r,2)));
	}

}

/*
Enter a radius
2.5
The area of circle: 19.634954084936208
*/