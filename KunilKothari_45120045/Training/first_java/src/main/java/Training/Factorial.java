package Training;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.print("Factorial of the number is :"+fact);
	}

}
