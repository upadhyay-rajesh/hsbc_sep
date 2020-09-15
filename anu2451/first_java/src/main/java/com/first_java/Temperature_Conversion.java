package com.first_java;

public class Temperature_Conversion {
	
	public static void main(String[] args)
	{
		float temp=69.0f;
		System.out.println("temperature in fahrenheit is:"+temp+"F");
		float celsius = ((temp-32)*5)/9;
		System.out.println("Centigrade temperature is:"+celsius+"C");
		
	}

}
