package rkdgr8;

import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to draw  a pattern");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
