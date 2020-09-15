package com.Day1_Assignment;

public class NineteenthProgram {
	static double sum(int x, int n) 
	{ 
	    double i, total = 1.0; 
	    for (i = 1; i <= n; i++) 
	        total = total +  
	                (Math.pow(x, i) / i); 
	  
	    return total; 
	} 
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = 2; 
		    int n = 5; 
		    System.out.printf("%.2f", sum(x, n)); 

	}

}
