package rkdgr8;
import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x and n for the series");
		int x = sc.nextInt();
		int n = sc.nextInt();
		double sum = 0;
		int f[] = new int[n+1];
		f[0] = 1;
		for (int i = 1; i <= n; i++) {
			f[i] = i * f[i - 1];
		}
	
		for (int i = 0; i <= n; i++) {
			sum += Math.pow(x,  i) / f[i];
		}
		
		System.out.println(sum);
		sc.close();
	}

}
