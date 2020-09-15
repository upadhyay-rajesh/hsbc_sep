package com.homework_java;

public class multiplytable_cmd {

	public static void main(String[] args) {
	
			int k,i;
			int l=Integer.parseInt(args[0]);
			System.out.println("Table of 10 is ");
			
			for(i=1; i<11;i++) 
			{
				k=l*i;
				System.out.print(" "+k);
			}


			}

}
