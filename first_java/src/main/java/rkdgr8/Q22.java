package rkdgr8;
import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st 3*3 matrix values");
		int i,j;
		int[][] x=new int[3][3];
		int[][] y=new int[3][3];
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				x[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("enter 2nd 3*3 matrix ");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				y[i][j]=sc.nextInt();
				
			}
		}
		int[][] ans=new int[3][3];
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				ans[i][j]=x[i][j]*y[j][i];
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
