package com.first_java;

public class pyramids {
  // pattern 1
	public static void main(String[] args) {
		int i, j, rows;
		 
		   for (i = 1; i <= 4; ++i) {
		      for (j = 1; j <= i; ++j) {
		    	  System.out.print(" "+j);
		      }
		      System.out.println("\n");
		   }
		   
	//pattern2
		   for (i = 1; i <= 4; i++) {
			   int n=4;
			      for (j = 1; j <= n-i; j++) {
			    	  System.out.print(" ");
			      }
			      for (int k = i; k >= 1; k--) {
			    	  System.out.print(k);
			      }
			      for (int l = 2; l <= i; l++) {
			    	  System.out.print(l);
			      }
			      
			      System.out.println();
			   }
     //pattern3
		   System.out.println();
		   for (i = 1; i <= 4; i++) {
			   int n=4;
			      for (j = 1; j <= n-i; j++) {
			    	  System.out.print(" ");
			      }
			      for (int k = i; k >= 1; k--) {
			    	  System.out.print(k);
			      }
			      for (int l = 2; l <= i; l++) {
			    	  System.out.print(l);
			      }
			      
			      System.out.println();
			   }
		   
		   for ( i = 3; i >=1; i--) {
			   int n=3;
			   System.out.print(" ");
			      for (j = 1; j <= n-i; j++) {
			    	  System.out.print(" ");
			      }
			      for (int k = i; k >= 1; k--) {
			    	  System.out.print(k);
			      }
			      for (int l = 2; l <= i; l++) {
			    	  System.out.print(l);
			      }
			      
			      System.out.println();
			   }
		   
	}

}
