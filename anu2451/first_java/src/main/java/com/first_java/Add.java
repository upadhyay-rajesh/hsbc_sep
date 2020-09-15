package com.first_java;

public class Add {

	public static void main(String[] args) {
		System.out.println("First Number:"+args[0]);
		System.out.println("Second Number:"+args[1]);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a+b;
		System.out.println("Addition of two number is:"+c);

	}

}
