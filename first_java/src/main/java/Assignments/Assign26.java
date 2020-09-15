package Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assign26 {
	public static void main(String[] args)throws IOException {
		BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
		 System.out.println("Enter  value");
	      double val= Double.parseDouble(stdin.readLine());
	      
	      
	      double sqrt = Math.pow(val, 0.5);
			System.out.println("Sqrt = " + sqrt);

	}

}

