package rkdgr8;
import java.util.Scanner;

public class Q33 {

		static double average (int[] arr) {
			
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			
			return ((double)sum / arr.length);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			
			double avg = average(arr);
			System.out.println(avg);
			sc.close();

		}

}
