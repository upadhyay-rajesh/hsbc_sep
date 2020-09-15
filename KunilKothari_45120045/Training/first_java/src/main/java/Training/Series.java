package Training;
import java.math.*;
import java.util.Scanner;
public class Series {

	public int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public double sum(int num) {
		double sum=1;
		for(int i=1;i<=num;i++) {
			int fact=factorial(i);
			sum=sum+((Math.pow(num, i))/fact);
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);	
		
		int num=sc.nextInt();
		Series s= new Series();
		double result= s.sum(num);
		System.out.print("The result of the series is:"+result);
		
		
	}

}
