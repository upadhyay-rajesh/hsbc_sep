package com.question_java;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,i,z,y,x;
		int p;
		System.out.println("the armstrong numbers are: ");
		for(i=100;i<999;i++)
		{
			m=i;
			z=m%10;
			y=(m/10)%10;
			x=(m/100)%10;
			p=x*x*x+y*y*y+z*z*z;
			if(i==p) {
			
				System.out.print(i+" ");
				
			}
				
		}
	}

}
