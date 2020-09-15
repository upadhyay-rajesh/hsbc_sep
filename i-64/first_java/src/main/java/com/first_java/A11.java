package com.first_java;
import java.util.*;

public class A11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int ans = n;
		while ((--n) != 0)
			ans *= n;
		System.out.println(ans);
		sc.close();
	}

}
