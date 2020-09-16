package assignment1;
import java.lang.Math;
import java.util.*;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double n,x;
		System.out.println("Enter number");
		n=sc.nextInt();
		x=Math.sqrt(n);
		System.out.println("Square root of "+n+" is "+x);
	}

}
