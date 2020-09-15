package com.first_java;

public class MatrixSubtraction{

	public static void main(String[] args) {
		  
          int a[][] = {{4,5,6},{3,4,1},{1,2,3}};   
          int b[][] = {{2,0,3},{2,3,1},{1,1,1}};  
    
          
          int c[][] = new int[3][3];  
    
          for(int i=0;i<3;i++)
  		    {    
  		       for(int j=0;j<3;j++)
  		       {    
  	        	    c[i][j]=a[i][j]-b[i][j];    
  		            System.out.print(c[i][j]+" ");    
  		       }    
  		  
  		       System.out.println();  
  		    }  
        }    
	}


