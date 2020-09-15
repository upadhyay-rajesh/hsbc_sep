package assignment1;
import java.util.Scanner;


public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		num1= num1+num2;
		num2= num1-num2;
		num1=num1-num2;
		
		System.out.println(num1+" "+num2);
	}

}
