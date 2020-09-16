package assignment1;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no ");
		int f;
		int a=sc.nextInt();
		if(a==0)
		{
			f=1;
		}
		else
		{
			f=1;
			while(a>0)
			{
				f=f*a;
				a--;
			}
		}
		System.out.println("Factorial is "+f);
	}

}
