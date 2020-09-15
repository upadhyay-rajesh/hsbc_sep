package com.first_java;
import java.util.*;

public class A9 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i < n; i++) {
			
			for (int j = 0; j < i; j++) {
				
				System.out.print(j * i + " ");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
