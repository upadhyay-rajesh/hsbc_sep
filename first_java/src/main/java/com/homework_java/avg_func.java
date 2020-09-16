package com.homework_java;

public class avg_func {


	public static void main(String[] args) {
		
		double result;
        
        double n=3,n1=4,n3=5;
        result = average(n,n1,n3);
        System.out.println("Average is : " + result);
        
    }


  public static double average(double i,double j,double k) {
        return ((i*j*k)/3.0);
    }
}