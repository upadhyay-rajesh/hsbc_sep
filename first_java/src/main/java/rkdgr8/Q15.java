package rkdgr8;
import java.util.*;
import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a = a^b;
		b = a^b;
		a= a^b;
		System.out.println(a);
		System.out.println(b);
	}
}
