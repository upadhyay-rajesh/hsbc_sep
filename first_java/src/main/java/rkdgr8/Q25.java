package rkdgr8;
import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		System.out.println("Enter a number to calculate square root");

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(Math.pow(n, 0.5));
		sc.close();
	}
}
