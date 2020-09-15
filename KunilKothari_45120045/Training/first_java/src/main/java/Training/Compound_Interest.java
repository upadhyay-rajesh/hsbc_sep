package Training;

import java.util.Scanner;

public class Compound_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter the principal ");
				 int P=sc.nextInt();
		System.out.println("Enter the Rate of Interest ");
				 int r=sc.nextInt();
		System.out.println("Enter the time for which interest is compunded yearly ");
				 int n=sc.nextInt();
				 
		double CI=P*(Math.pow((1+0.01*r), n)-1);
		System.out.println("Compund Interest :"+CI);

	}

}
