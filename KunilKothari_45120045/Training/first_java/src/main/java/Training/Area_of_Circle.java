package Training;

import java.util.Scanner;

public class Area_of_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the radius of the circle");
		Scanner sc= new Scanner(System.in);	
		
		int r=sc.nextInt();
		double area = 3.14*r*r;
		System.out.println(area);

	}

}
