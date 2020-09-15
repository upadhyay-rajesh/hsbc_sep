package Training;

import java.util.Scanner;

public class SUB2MATRICES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int a[][]= new int[3][3];
		int b[][]= new int[3][3];
		int R[][]=new int [3][3];
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter the first matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				 a[i][j]=sc.nextInt();			
				 }
		}
		
		System.out.println("Enter the Second matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				 b[i][j]=sc.nextInt();			
				 }
		}

		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				 R[i][j]=a[i][j]-b[i][j];			
				 }
	}
		
		System.out.println("ADDITION:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				 System.out.print(R[i][j]+" ");		
				 }
			System.out.println();
	}

	}

}
