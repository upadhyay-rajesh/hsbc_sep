package Assignments;

import java.io.*;

public class Assign8 {

	public static void main(String[] args)throws IOException {

		 BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
        
		 // user input
          System.out.println("Enter : ");
          int n = Integer.parseInt(stdin.readLine());
	
		StringBuilder s = new StringBuilder();
			s.append(Integer.toString(n));
			s.reverse();
			System.out.println(s);
	}

}
