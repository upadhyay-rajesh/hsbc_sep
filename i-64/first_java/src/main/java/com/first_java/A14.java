package com.first_java;
import java.util.*;

public class A14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if ((i & 1) == 1)sum += i;
		}
		System.out.println(sum);
		
		sc.close();
	}

}
