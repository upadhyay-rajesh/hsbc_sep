package assignment1;
import java.util.Scanner;


public class Average {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum=0;

		System.out.println("ENTER THE SIZE OF ARRAY");
		int limit = sc.nextInt();
		int A[] = new int[limit];
		
		System.out.println("Enter numbers:");
		for(int i=0; i<limit; i++) 
		{
			
			A[i]= sc.nextInt();
			sum = sum+A[i];
		
		}
		
		float avg= sum/limit;
		
		System.out.println("Average:"+ avg);
		
}
}
