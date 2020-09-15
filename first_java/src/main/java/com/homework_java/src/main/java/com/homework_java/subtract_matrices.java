package com.homework_java;

public class subtract_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int [] arr = new int [] {15, 22, 82, 7, 11}; 
		   int [] brr = new int [] {25, 2, 8, 17, 12}; 
		   int crr[]=new int[5];
		   
		   for(int i=0;i<5;i++)
		   {
			   crr[i]=arr[i]-brr[i];
		   }
		   for(int i=0;i<5;i++)
		   {
			   System.out.print(" " +crr[i]);
		   }

	}

}
