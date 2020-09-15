package com.question_java;
import java.util.*;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int prod =1;
		Scanner s=new Scanner(System.in);
		System.out.println("input the number whose factorial needed: ");
		int x=s.nextInt();
		while(x>0) {
			prod*=x;
			x-=1;
				
		}
		if(x<0) {
			System.out.println("factorial cant be found.");
		}
		System.out.println("factorial is: "+prod);
	}
	

}
