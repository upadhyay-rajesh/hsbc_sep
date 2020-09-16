package assignment1;
import java.util.*;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter size of array");
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		System.out.println("Array is");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println("\nCopied array is");
		for(i=0;i<n;i++)
			System.out.print(b[i]+" ");
	}

}
