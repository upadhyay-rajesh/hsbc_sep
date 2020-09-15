package com.assign;
import java.io.*;
public class P32 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter len then enter element");
		int n = Integer.parseInt(br.readLine());
		int a[]= new int [n];int t;
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Copying and displaying second array now");
		int a1[]= new int [n];int t1;
		for(int i=0;i<n;i++)
		{
			a1[i]=a[i];
			System.out.println(a1[i]);
		}

	}

}
