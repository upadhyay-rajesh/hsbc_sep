package com.first_java;
import java.util.*;

public class A8 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder s = new StringBuilder();
		s.append(Integer.toString(n));
		s.reverse();
		System.out.println(s);
		
		sc.close();
	}
}
