package Training;

import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter the principal ");
				 int P=sc.nextInt();
		System.out.println("Enter the Rate of Interest ");
				 int R=sc.nextInt();
		System.out.println("Enter the Time is Years ");
				 int T=sc.nextInt();
				 
		double SI=(P*R*T*0.01);
		System.out.println("Simple Interest :"+SI);
						 }

}
