package assignment1;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer");
		int num = sc.nextInt();
		int reversed=0;
		
		while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

		System.out.println(reversed);
		
	}

}
