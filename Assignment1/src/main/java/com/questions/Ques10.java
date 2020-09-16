package com.questions;

import java.util.Scanner;

public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a temperature in fahrenheit");
		double f=obj.nextDouble();
		double celcius=0;
		celcius=(f-32)*5/9;
		System.out.println("Temperature in celcius: "+ celcius);
	}

}
/*Enter a temperature in fahrenheit
69
Temperature in celcius: 20.555555555555557
*/