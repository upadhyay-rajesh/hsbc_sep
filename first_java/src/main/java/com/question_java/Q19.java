package com.question_java;

import java.util.Scanner;
import java.lang.Math;

public class Q19 {

	public static int fact(int x) {
		int p=1;
		while(x>0) {
			p*=x;
			x-=1;
		}
		return p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("input numer of series elements");
		int n=s.nextInt();
		System.out.println("get value of x");
		int x=s.nextInt();
		n=n-1;
		int i;
		float sum=1;
		for(i=1;i<=n;i++) {
			sum+=Math.pow(x, i)/fact(i);
		}
		System.out.println("the sum of series is: "+sum);
	}

}
