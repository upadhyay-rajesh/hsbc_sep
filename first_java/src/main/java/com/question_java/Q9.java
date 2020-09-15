package com.question_java;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		for(i=1;i<8;i++)
		{
			j=1;
			while(j<=i) {
				System.out.print(i*(j-1)+" ");
				j+=1;
			}
			System.out.println();
		}
	}

}
