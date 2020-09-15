package rkdgr8;
import java.util.*;

public class Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ans = 1;
		while (n != 0 ) {
			ans *= n;
			n=n-1;
			
		}
		System.out.println(ans);
		sc.close();

	}

}
