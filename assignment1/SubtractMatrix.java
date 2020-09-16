package assignment1;
import java.util.*;

public class SubtractMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n, c, d,i,j;
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter the number of rows and columns of first matrix");
	    m = sc.nextInt();
	    n =sc.nextInt();
	    
	    System.out.println("Enter the number of rows and columns of second matrix");
	    c = sc.nextInt();
	    d =sc.nextInt();
	    
	    if(c!=m || d!=n)
	    	System.out.println("Matrices cannot be subtracted");
	    else
	    {
		    int first[][] = new int[m][n];
		    int second[][] = new int[m][n];
		    int diff[][] = new int[m][n];
	
		    System.out.println("Enter the elements of first matrix");
	
		    for (i = 0; i < m; i++)
		      for (j = 0; j < n; j++)
		        first[i][j] = sc.nextInt();
	
		    System.out.println("Enter the elements of second matrix");
	
		    for (i = 0 ; i < m; i++)
		      for (j = 0 ; j < n; j++)
		        second[i][j] = sc.nextInt();
	
		    for (i = 0; i < m; i++)
		      for (j = 0; j < n; j++)
		        diff[i][j] = first[i][j] - second[i][j];  //replace '+' with '-' to subtract matrices
	
		    System.out.println("Difference of the matrices:");
	
		    for (i = 0; i < m; i++)
		    {
		      for (j = 0; j < n; j++)
		        System.out.print(diff[i][j] + "\t");
	
		      System.out.println();
		    }
	    }
		      
	}

}
