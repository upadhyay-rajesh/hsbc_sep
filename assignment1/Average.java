package assignment1;

import java.util.*;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of n ");
		n=sc.nextInt();
		int a[]= new int[n];
		float t=0,avg;
		int i;
		System.out.println("Enter nos");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			t+=a[i];
		}
		avg=t/n;
		System.out.println("Avg is "+avg);
	}

}
