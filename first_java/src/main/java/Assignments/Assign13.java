package Assignments;

import java.io.*;
public class Assign13 {
	public static void main(String[] args)throws IOException {
		  BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	         
			 // user input
	           System.out.println("Enter radius  : ");
	          
		  int rad= Integer.parseInt(stdin.readLine());
		  double area = Math.PI *rad*rad;
		  System.out.println("Area is  : "+area);

	}

}
