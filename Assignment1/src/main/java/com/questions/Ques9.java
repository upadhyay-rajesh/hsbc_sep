package com.questions;

public class Ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=1,n=0;
for(int i=1;i<=7;i++)
{
	
	for(int j=0;j<i;j++)
	{
		int k=0;
		n=cnt*j;
        System.out.print(n+" ");
		
	}
	cnt++;
	System.out.println();
}

	}

}
/*
0 
0 2 
0 3 6 
0 4 8 12 
0 5 10 15 20 
0 6 12 18 24 30 
0 7 14 21 28 35 42 
*/