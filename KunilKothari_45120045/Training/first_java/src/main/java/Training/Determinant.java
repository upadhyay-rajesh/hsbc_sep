package Training;

import java.util.Scanner;

public class Determinant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= new int[3][3];
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter the 3 by 3 matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				 a[i][j]=sc.nextInt();			
				 }
		}
		
		int x=(a[0][0] * (a[1][1] * a[2][2]
                - a[1][2] * a[2][1]));
		
		int y=(a[0][1] * (a[1][0] * a[2][2]
                - a[1][2] * a[2][0]));
		
		int z=(a[0][2] * (a[1][0] * a[2][1]
                - a[1][1] * a[2][0]));
		
		int determinant= x - y + z;
		
		System.out.println("The modulus of the given a is "+ determinant);

	}

}
