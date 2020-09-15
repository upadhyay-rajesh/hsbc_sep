package com.first_java;

public class compundinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float p, r,  t,  si; 
         p = 13000;  r = 12; t = 2;  
		double ci = p *(Math.pow((1 + r / 100), t));
        System.out.println("compound Interest is: " +ci);  

	}

}
