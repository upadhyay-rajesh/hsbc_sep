package rkdgr8;
import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of array");
		int length = sc.nextInt();
		int[] data = new int[length];
		System.out.println("Enter numbers to take average of");
		for(int i=0;i<length;i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		
		int avg=0;
		for(int i=0;i<length;i++)
		{
			avg+=data[i];
		}		
		System.out.println( (float)avg/length);
	}
}
