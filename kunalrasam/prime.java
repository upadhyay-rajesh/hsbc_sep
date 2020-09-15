package com.first_java;

public class prime {

	public static void main(String[] args) {
		int primeno=Integer.parseInt(args[0]);
		int flag=0;
		int m=primeno/2;      
		if(primeno==0 ||primeno==1)
		{
			System.out.println("number is not prime");
		}else
		{
			
			for(int i=2;i<=m;i++){      
			    if(primeno%i==0){      
			     System.out.println(primeno+" is not prime number");      
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag==0)  
			   { System.out.println(primeno+" is prime number"); }  
			  
				}
			
		}

	}


