package Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assign7 {

	public static void main(String[] args)throws IOException {

		 BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
         
		 // user input
           System.out.println("Enter no of elements in array : ");
           int n = Integer.parseInt(stdin.readLine());
		int arr[] = new int[n];
		int sum = 0;
		
		 System.out.println("Enter elements in array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(stdin.readLine());
			sum += arr[i];
		}
		
		double avg = ((double) sum) / n;
		
		System.out.println("The avg is " + avg);
		

	}

}
