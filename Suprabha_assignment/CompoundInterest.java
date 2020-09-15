package com.first_java;

public class CompoundInterest {

	public static void main(String[] args) {
		
		
		double amt=0,p=1000,r=10,t=3,ci;			
		
	 
		amt=p*((1+r/100)*(1+r/100)*(1+r/100));
	 
		System.out.println("Amount="+amt);
	 
		ci=amt-p;
	 
		System.out.println("Compound Interest="+ci);

	}

}
