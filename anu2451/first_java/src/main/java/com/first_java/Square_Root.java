package com.first_java;

import java.util.*;
public class Square_Root {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter number");
		double n = scan.nextDouble();
		double skt = Math.sqrt(n);
		System.out.println("Square root of "+n+" is: "+skt);

	}

}
