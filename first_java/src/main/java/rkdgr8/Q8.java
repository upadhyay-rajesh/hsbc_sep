package rkdgr8;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		 StringBuffer s = new StringBuffer(sc.next());
		System.out.println(s.reverse());
		sc.close();
	}
}
