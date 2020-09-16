package assignment1;
import java.util.*;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no ");
		int x= sc.nextInt();
		int j=0,i;
		for(i=2;i<=x/2;i++)
		{
			if(x%i==0)
			{
				j=1;
				break;
			}
		}
		if(j==0)
			System.out.println("Prime no");
		else
			System.out.println("Not a prime no");
	}

}
