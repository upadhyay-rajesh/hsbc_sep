package Training;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ascending_Descending {
	
	
	            

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number of elements to sort");
		Scanner sc= new Scanner(System.in);	
		int num=sc.nextInt();
		System.out.println("Enter the numbers");
		
		int a1[]=new int[num];
		
		for(int i=0;i<num;i++) {
			a1[i]=sc.nextInt();
		}
		Arrays.sort(a1);
		System.out.println("The ascending order is : ");
		for(int i=0;i<num;i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		System.out.println("The descending order is : ");
		for(int i=num-1;i>=0;i--) {
			System.out.print(a1[i]+" ");
		}
		
		
	}

}
