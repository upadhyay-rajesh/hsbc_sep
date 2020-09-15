package com.first_java;
import java.io.*;

public class A1 {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(in.readLine());
			int b = Integer.parseInt(in.readLine());
			System.out.println("Sum = " + (a + b));
		}
		catch (Exception e) {
			System.out.println("An error occurred");
		}
	}

}
