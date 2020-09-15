package Training;

import java.util.Scanner;

public class Copy_Data_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a[]= new int[10];
		int b[]= new int[10];
		
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter the array for data transfer");
		for(int i=0;i<10;i++) {
			
				 a[i]=sc.nextInt();			
			}
		
		for(int i=0;i<10;i++) {
			b[i]=a[i];	
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(b[i]);	
		}
		
		
		}

	}


