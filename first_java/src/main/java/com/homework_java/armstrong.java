package com.homework_java;

public class armstrong {

	public static void main(String[] args) {
		int i=153;
		int n=i,k=0,a=0;
		boolean flag=false;
		
		while(n!=0)
		{
			
			k=n%10;
			a=a+(k*k*k);
			n=n/10;
			
		}
		
		if(a==i)
		{
			flag=true;
		}
		
		if(flag==true)
		
			System.out.println("Is armstrong");
			else
				System.out.println("Is not armstrong");
				
		

	}

}
