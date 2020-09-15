import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class P30 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int col,row;
		System.out.println("Enter the number of rows");
		row =Integer.parseInt(br.readLine());
		 
		System.out.println("Enter the number columns");
		col = Integer.parseInt(br.readLine());
		 
		int mat1[][] = new int[row][col];
		int mat2[][] = new int[row][col];
		int res[][] = new int[row][col];
		 
		System.out.println("Enter the elements of matrix1");
		 
		for (int i= 0 ; i < row ; i++ )
		{ 
		 
		for  ( int j= 0 ; j < col ;j++ )
		mat1[i][j] =  Integer.parseInt(br.readLine());
		 
		System.out.println();
		}
		System.out.println("Enter the elements of matrix2");
		 int i,j;
		for ( i= 0 ; i < row ; i++ )
		{
		 
		for ( j= 0 ; j < col ;j++ )
		mat2[i][j] = Integer.parseInt(br.readLine());
		 
		System.out.println();
		}
		 
		for ( i= 0 ; i < row ; i++ )
		for ( j= 0 ; j < col ;j++ )
		res[i][j] = mat1[i][j] + mat2[i][j] ; 
		 
		System.out.println("Sum of matrices:-");
		 
		for ( i= 0 ; i < row ; i++ )
		{ 
		for ( j= 0 ; j < col ;j++ )
		System.out.print(res[i][j]+"\t");
		 
		System.out.println();   
	   }
	}

}
