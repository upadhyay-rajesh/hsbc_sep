package Training;

import java.util.Scanner;

public class AVG_N {
	
	public void average(int a[])
	{
		int sum=0,n=a.length;
		for(int i=0;i<n;i++)
		{
			sum=sum+i;
		}
		float avg=sum/n;
		System.out.println("AVERAGE:"+avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);	
		System.out.println("How many number do you want to take average of");
		int n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the array for data transfer");
		for(int i=0;i<n;i++) {
			
				 a[i]=sc.nextInt();			
			}
		AVG_N obj = new AVG_N();
		obj.average(a);

	}

}
