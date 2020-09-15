package assignment1;
import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius in metre");
		
		float radius = sc.nextFloat();
		
		double area =3.14*radius*radius;
		System.out.println("Area of circle is: "+ area+ " metresquare");
		
	}

}
