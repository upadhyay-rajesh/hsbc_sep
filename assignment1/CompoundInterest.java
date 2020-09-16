package assignment1;
import java.util.*;
import java.lang.Math;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			double P, R, Ti, Amount, CI;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Principal Amount ");
			P = sc.nextDouble();
			
			System.out.println("Enter the Rate Of Interest ");
			R= sc.nextDouble();
			
			System.out.println("Enter the Time Period in Years ");
			Ti= sc.nextDouble();
			
			Amount= P * (Math.pow(( 1 + R/100), Ti));
			CI = Amount - P;
			
			System.out.println("The Future Compound Interest for Principal Amount " +Amount);
			System.out.println("The Compound Interest for Principal Amount "+ CI);
	}

}
