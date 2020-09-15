package com.first_java;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		  
       System.out.println(Math.pow(a, 2)); 
       s.close();
	}

}
