package rkdgr8;
import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the matrix");
		Scanner sc=new Scanner(System.in);
		int[][] matrix=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix[i][j]=sc.nextInt();
				
			}
		}
		int sum;
		sum=matrix[0][0]*(matrix[1][1]*matrix[2][2] - matrix[2][1]*matrix[1][2]);
		sum-=matrix[0][1]*(matrix[1][0]*matrix[2][2]-matrix[2][0]*matrix[1][2]);
		sum+=matrix[0][2]*(matrix[1][0]*matrix[2][1]-matrix[2][0]*matrix[1][1]);
		System.out.println(sum);
		sc.close();
	}

}
