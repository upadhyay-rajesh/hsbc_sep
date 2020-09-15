package com.first_java;
import java.util.*;

public class A6 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 2; i * i <= n; i++) {
			
			if (n % i == 0) {
				System.out.println("Not Prime");
				sc.close();
				return;
			}
		}
		System.out.println("Prime");
		sc.close();
	}
}
