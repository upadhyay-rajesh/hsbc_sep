package rkdgr8;
import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to calculate square");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(Math.pow(n, 2));
		sc.close();
	}

}
