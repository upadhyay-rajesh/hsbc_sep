
public class Factorial {

	public static void main(String[] args) {
		int n=7;
		int fact=1;
		System.out.print("Factorial of "+ n);
		while(n!=0)
		{
			fact=fact*n;
			n=n-1;
		}
		System.out.println(" is "+fact);
	}

}
