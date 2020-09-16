package assignment1;
import java.util.*;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p, r, t, si;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = sc.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = sc.nextFloat();
        System.out.print("Enter the Time period : ");
        t = sc.nextFloat();
        si= (p * r * t) / 100;
        System.out.print("Simple Interest is: " +si);
	}

}
