package rkdgr8;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		int sumOfCubes=0;
		    while(num>0)  
		    {  
		    	sumOfCubes+= Math.pow(num%10,3);
		    	num=num/10;
		    }  
		    if(sumOfCubes == n)  
		    System.out.println("its an armstrong number");   
		    else  
		        System.out.println("its not a armstrong number");   
	
	}

}
