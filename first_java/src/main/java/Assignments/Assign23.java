package Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assign23 {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	      System.out.println("Enter  principal rate time ");
	      double p= Double.parseDouble(stdin.readLine());
	      double r=Double.parseDouble(stdin.readLine());
	      double t= Double.parseDouble(stdin.readLine());
	      
	      double si= p*r*t/100;
	      System.out.println("si "+si);

	}

}
