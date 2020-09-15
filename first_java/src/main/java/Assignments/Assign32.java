package Assignments;

import java.io.*;

public class Assign32 {

	public static void main(String[] args)throws IOException {
	 BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter size");
	int size = Integer.parseInt(stdin.readLine());
	
	 
	 int arr1[]= new int[size];
	 int arr2[]= new int[size];
	 //input
	 System.out.println("Enter arr 1");
	 int i,j;
     for(i=0;i<size;i++)
     {
    	  arr1[i]= Integer.parseInt(stdin.readLine());
     }
     System.out.println("Enter arr 2");
     for(i=0;i<size;i++)
     {
    	  arr2[i]=arr1[i];
     }
     System.out.println("other arr is");
     for(i=0;i<size;i++)
     {
    	 
    		   System.out.println(arr2[i]);
         
     }
  

	}



}
