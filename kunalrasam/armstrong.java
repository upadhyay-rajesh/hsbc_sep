package com.first_java;

public class armstrong {

	public static void main(String[] args) {
		int c=0,x,temp;  
	    int y=371; 
	    temp=y;  
	    while(y>0)  
	    {  
	    x=y%10;  
	    y=y/10;  
	    c=c+(x*x*x);  
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number");   
	    else { 
	        System.out.println("Not armstrong number");   
	   }  

	}

}
