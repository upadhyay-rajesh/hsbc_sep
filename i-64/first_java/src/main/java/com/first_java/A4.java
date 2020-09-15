package com.first_java;

public class A4 {
	public static void main (String args[]) {

		int dp[] = new int[20];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i < 20; i++) 
			dp[i] = dp[i - 1] + dp[i - 2];
		
		for (int i = 0; i < 20; i++)
			System.out.println(dp[i]);
	}
}
