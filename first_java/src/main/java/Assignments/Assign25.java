package Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assign25 {
	public static void main(String[] args)throws IOException {
		BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
		 System.out.println("Enter  value");
	      double val= Double.parseDouble(stdin.readLine());
	      
	      
	      double square = Math.pow(val, 2);
			System.out.println("Square = " + square);

	}

}
