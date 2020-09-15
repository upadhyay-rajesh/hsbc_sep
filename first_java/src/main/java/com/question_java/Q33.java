package com.question_java;

import java.util.Scanner;

public class Q33 {
	public static float avrg(int[] x) {
		int i,n;
		float sum=0;
		n=x.length;
		for(i=0;i<n;i++) {
			sum+=x[i];
		}
		return sum/n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("input number of elements:");
		int n=s.nextInt();
		int[] x= new int[n];
		int i;
		System.out.println("input the elements:");
		for(i=0;i<n;i++)
		{
			x[i]=s.nextInt();
		}
		Q33 q= new Q33();
		System.out.println(""+q.avrg(x));
		
	}

}
