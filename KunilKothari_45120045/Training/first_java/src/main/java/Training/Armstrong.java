package Training;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);	
		
		int num=sc.nextInt();
		int sum=0;
		int n=num;
		while(num>0) {
			int d=num%10;
			sum=sum+(d*d*d);
			num=num/10;
		}

		if(sum==n)
		{
			System.out.println("Its an Armstrong Number");
		}
		else
		{
			System.out.println("Its not an Armstrong number");
		}
		
	}

}
