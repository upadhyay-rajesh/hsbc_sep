package Training;

import java.util.Scanner;

public class Square_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter the number whos square root has to be found");
		int num=sc.nextInt();
		double sqr= Math.sqrt(num);
		
		System.out.println("Square of the entered number is :"+sqr);

	}

}
