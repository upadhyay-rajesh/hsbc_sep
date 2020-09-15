package Assignments;
import java.io.*;

public class Assign19 {

	public static void main(String[] args)throws IOException {
		  BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
	      System.out.println("Enter x  : ");
	       
		  int x= Integer.parseInt(stdin.readLine());
		    System.out.println("Enter no is elements of series  : ");
		int n = Integer.parseInt(stdin.readLine());
		
		int fact[] = new int[n + 1];
		
		fact[0] = 1;
		for (int i = 1; i <= n; i++) {
			fact[i] = i * fact[i - 1];

		}
		double sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += Math.pow(x,  i) / fact[i];
		}
		
		System.out.println(sum);

	}

}
