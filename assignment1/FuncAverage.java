package assignment1;
import java.util.*;

public class FuncAverage {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int i;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		double x=avg(a,n);
		System.out.println("Average is "+x/n);
	}
	
	static double avg(int a[], int n)
	{
		double r=0;
		 
		   for(int i=0;i<n;i++)
		       r=r+a[i];
	 
		   return r;
	}
}
