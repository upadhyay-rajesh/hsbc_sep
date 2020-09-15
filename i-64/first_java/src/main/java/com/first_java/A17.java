package com.first_java;

public class A17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = args[0];
		for (int i = 0; i < s.length(); i++) {
			if ((int)s.charAt(i) >= (int)'0' && (int)s.charAt(i) <= (int)'9') continue;
			else {
				System.out.println("Invalid Input");
				return;
			}
		}
		int n = Integer.parseInt(s);
		System.out.println("sum = " + ((n + 1) * n) / 2);
	}

}
