package com.first_java;
import java.util.*;

public class A5 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < 10; i++)
			System.out.println((i + 1) * a);
		sc.close();
	}
}
