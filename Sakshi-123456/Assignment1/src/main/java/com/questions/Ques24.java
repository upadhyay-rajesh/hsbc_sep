package com.questions;

import java.util.Scanner;

class CI{
	int n,p;
	float r;
	CI(int n,int p, float r)
	{
		this.n=n;
		this.p=p;
		this.r=r;
	}
	double calculate()
	{
		return Math.pow(p*(1+(r/100)),n)-p;
	}
}
public class Ques24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,p;
		float r;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter principal amount");
		p=obj.nextInt();
		System.out.println("Enter number of years");
		n=obj.nextInt();
		System.out.println("Enter rate of interest");
		r=obj.nextFloat();
		CI ci=new CI(n,p,r);
		System.out.println("Compound Interest: "+ci.calculate());

	}

}

/*
Enter principal amount
40000
Enter number of years
5
Enter rate of interest
0.5
Compound Interest: 1.0498572832032E23
*/