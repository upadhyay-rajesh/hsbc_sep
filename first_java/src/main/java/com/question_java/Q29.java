package com.question_java;

public class Q29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k,l;
		for(i=1;i<=4;i++)
		{
			
			k=4-i;
			for(l=1;l<=k;l++) {
				System.out.print(" ");
			}
			for(j=i;j>=2;j--) {	
				System.out.print(j);
			}
			for(j=1;j<=i;j++) {	
				System.out.print(j);
			}
			for(l=1;l<=k-1;l++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		for(i=3;i>=1;i--)
		{
			
			k=4-i;
			for(l=1;l<=k;l++) {
				System.out.print(" ");
			}
			for(j=i;j>=2;j--) {	
				System.out.print(j);
			}
			for(j=1;j<=i;j++) {	
				System.out.print(j);
			}
			for(l=1;l<=k-1;l++) {
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
