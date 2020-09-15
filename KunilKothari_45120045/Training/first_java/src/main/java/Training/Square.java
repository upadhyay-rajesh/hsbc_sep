package Training;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter the number to be squared ");
		int num=sc.nextInt();
		double sqr= Math.pow(num, 2);
		
		System.out.println("Square of the entered number is :"+sqr);
		
	}

}
