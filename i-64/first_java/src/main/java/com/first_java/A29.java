package com.first_java;

public class A29 {
	
	public static void main (String args[]) {
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 1; j <= (10 - 2 * i); j++) {
				
				System.out.print(" ");
			}
			
			for (int j = i; j > 0; j--) {
				
				System.out.print(j + " ");
			}
			
			for (int j = 2; j <= i; j++) {
				
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 1; j <= 2 * i; j++) {
				
				System.out.print(" ");
			}
//			
//			for (int j = i; j > 0; j--) {
//				
//				System.out.print(j + " ");
//			}
			
//			for (int j = 2; j <= i; j++) {
//				
//				System.out.print(j + " ");
//			}
			
			for (int j = 5 - i; j > 0; j--) {
				
				System.out.print(j + " ");
			}
			
			for (int j = 2; j <= 5 - i; j++) {
				
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
}
