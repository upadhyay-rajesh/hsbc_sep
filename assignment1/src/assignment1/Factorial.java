package assignment1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		
		int num = sc.nextInt();
		int factorial=1;
		
		for(int i=num; i>0; i--)
			factorial= factorial*i;
		
		System.out.println("Factorial is: "+ factorial);
	}

}
