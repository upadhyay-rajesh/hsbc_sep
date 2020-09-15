package com.first_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Determinant {
	////21
	    public static void main(String[] args) {
	        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	        int[][] matrix=new int[3][3];
	        System.out.println("Enter the elements of 3x3 matrix");
	        int i,j;
	        for(i=0;i<matrix.length;i++){
	            for(j=0;j<matrix[i].length;j++){
	                try{
	                    matrix[i][j]=Integer.parseInt(br.readLine());
	                }
	                catch(Exception e){
	                    System.out.println("An error occured. Please retry");
	                    return;
	                }
	            }
	        }
	        int determinant,x,y,z;
	        x=(matrix[0][0] * (matrix[1][1] * matrix[2][2]
	                       - matrix[1][2] * matrix[2][1]));
	        y=(matrix[0][1] * (matrix[1][0] * matrix[2][2]
	                       - matrix[1][2] * matrix[2][0]));
	        z=(matrix[0][2] * (matrix[1][0] * matrix[2][1]
	                       - matrix[1][1] * matrix[2][0]));
	        determinant= x - y + z;
	        System.out.println("The determinant of the given matrix is "+ determinant);
	 ///22
	        
	        int a[][]={{1,2,3},{2,4,5},{3,7,9}};    
	        int b[][]={{1,4,5},{2,7,9},{3,6,3}};    
	        
	        int c[][]=new int[3][3]; 
	            
	          
	        for(i=0;i<3;i++){    
	        for(j=0;j<3;j++){    
	        c[i][j]=0;      
	        for(int k=0;k<3;k++)      
	        {      
	        c[i][j]+=a[i][k]*b[k][j];      
	        }
	        System.out.print(c[i][j]+" ");   
	        }
	        System.out.println();
	        }    
	   //30
	        
	        for( i=0;i<3;i++){    
	        	for( j=0;j<3;j++){    
	        	c[i][j]=a[i][j]+b[i][j];    
	        	System.out.print(c[i][j]+" ");    
	        	}    
	        	System.out.println(); 
	        	}    
	   //31
	        
	        for( i=0;i<3;i++){    
	        	for( j=0;j<3;j++){    
	        	c[i][j]=a[i][j]-b[i][j];    
	        	System.out.print(c[i][j]+" ");    
	        	}    
	        	System.out.println(); 
	        	}    
	        
	    }
	    

}
