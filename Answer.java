package com.first_java;

import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {
		///// Q 19
		float x,sum,no_row;
		int i,n;
		Scanner s = new Scanner(System.in);
		System.out.println("Input the value of x :");
		x = s.nextInt();
		System.out.println("Input number of terms : ");
		n = s.nextInt();
		sum =1; no_row = 1;
		for (i=1;i<n;i++)
		{
		  no_row = no_row*x/(float)i;
		  sum =sum+ no_row;
		}
		System.out.println("\nThe sum  is :"+ sum);
        
        /////// Q 20
        int temp;
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for ( i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
        
        System.out.print("Descending Order:");
        for ( i = n-1 ; i > 0; i--) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[0]);
        
      
       /////// Q 32
        int [] arr1 = new int [] {5, 2, 7, 4, 9};     
        int arr2[] = new int[arr1.length];    
      
       for ( i = 0; i < arr1.length; i++) {     
           arr2[i] = arr1[i];     
       }      
       System.out.println(" ");
       System.out.println("Elements of original array: ");    
       for (i = 0; i < arr1.length; i++) {     
          System.out.print(arr1[i] + " ");    
       }     
           
       System.out.println();    
    
       System.out.println("Elements of new array: ");    
       for ( i = 0; i < arr2.length; i++) {     
          System.out.print(arr2[i] + " ");    
       }  
       s.close();  
	}
  }
	

      
       
       

