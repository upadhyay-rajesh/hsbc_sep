package Training;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int n,sum=0;

		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter the number of elements to take the average");
		int no=sc.nextInt();
		int a[]=new int[no];
		System.out.println("Enter the numbers");
		for(int i=0;i<no;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
			
		}
		
		System.out.println("The average is :"+(sum/no));

	}

}
