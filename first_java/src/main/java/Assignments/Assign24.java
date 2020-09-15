package Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assign24 {
	public static void main(String[] args)throws IOException {
		BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
		 System.out.println("Enter  principal rate time ");
	      double p= Double.parseDouble(stdin.readLine());
	      double r= Double.parseDouble(stdin.readLine());
	      double t= Double.parseDouble(stdin.readLine());
	      
	      
	      double amt = p * Math.pow(1 + r / 100.0, t);
			System.out.println("ci = " + (amt - p));

	}

}
