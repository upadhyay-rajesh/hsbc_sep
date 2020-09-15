package com.first_java;
import java.lang.Math;
import java.util.Scanner; 
public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		  
        System.out.println(Math.sqrt(a)); 
       s.close();
	}

}
