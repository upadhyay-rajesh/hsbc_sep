package com.homework_java;

public class cube {

	public static void main(String[] args) {
		int i;
		double cube;
		
		for(i=1;i<=10;i++)
		{
			cube=Math.pow(i, 3);
			System.out.println("Cube of " +i+ " is " +cube);
		}

	}

}
