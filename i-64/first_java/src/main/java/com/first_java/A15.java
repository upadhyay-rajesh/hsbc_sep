package com.first_java;
import java.util.*;

public class A15 {

	
//	public static void swap (int &a, int& b) {
		
		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input space separated a, b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int temp = a;
		a = b;
		b = temp;

		System.out.println("a = " + a + " b = " + b);
//		swap(a, b);
		
		sc.close();
	}

}
