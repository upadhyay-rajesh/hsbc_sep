package com.first_java;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		  int i,fact=1;  
		  int number;
		  Scanner in=new Scanner(System.in);
		  number=in.nextInt();
		  
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);  

	}

}
