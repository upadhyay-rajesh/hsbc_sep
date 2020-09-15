package Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assign20 {

	public static void main(String[] args)throws IOException {
		  BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	      System.out.println("Enter size of array : ");
	      int size= Integer.parseInt(stdin.readLine());
	      
	      int[] arr = new int[size];
	      int i,j,temp;
	      for(i=0;i<size;i++)
	      {
	    	  arr[i]= Integer.parseInt(stdin.readLine());
	      }
	      
	      //ascending
	      for(i=0;i<size;i++)
	      {
	    	  for(j=i;j<size;j++)
		      {
		    	if(arr[i]>arr[j])
		    	{
		    		temp= arr[i];
		    		arr[i]=arr[j];
		    		arr[j]=temp;
		    	}
		      }
	      }
	      
	      //printing
	      System.out.println("Printing : ");
	      for(i=0;i<size;i++)
	      {System.out.println(arr[i]);
	      }
	    //descending
	      for(i=0;i<size;i++)
	      {
	    	  for(j=i;j<size;j++)
		      {
		    	if(arr[i]<arr[j])
		    	{
		    		temp= arr[i];
		    		arr[i]=arr[j];
		    		arr[j]=temp;
		    	}
		      }
	      }
	      System.out.println("Printing : ");
	      //printing
	      for(i=0;i<size;i++)
	      {System.out.println(arr[i]);
	      }
	      
	      
	      
	      
	}
	       

}
