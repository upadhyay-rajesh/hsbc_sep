package Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assign11 
{

	public static void main(String[] args)throws IOException
	{
		  int i,fact=1; 
		  BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	         
			 // user input
	           System.out.println("Enter no  : ");
	          
		  int num= Integer.parseInt(stdin.readLine()); 
		  for(i=1;i<=num;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+num+" is: "+fact);    
		   

	}

}
