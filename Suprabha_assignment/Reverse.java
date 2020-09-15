package com.first_java;

public class Reverse {

	public static void main(String[] args) {
		int a,n=12, reverse = 0;
		a=n;

	    while(n != 0)
	    {
	      reverse = reverse * 10;
	      reverse = reverse + n%10;
	      n = n/10;
	    }

	    System.out.println("Reverse of " +a+ " is " + reverse);

	}

}
