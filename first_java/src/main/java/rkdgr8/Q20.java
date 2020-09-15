package rkdgr8;
import java.util.*;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]= sc.nextInt();
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
			System.out.print(' ');
		}
	}

}
