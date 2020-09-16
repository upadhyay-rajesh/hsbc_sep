package assignment1;
import java.lang.Math;
import java.util.*;

public class SumSeries {
	
	static int fact(int a)
	{
		if(a==0)
		{
			return 1;
		}
		else
		{
			int f=1;
			while(a>0)
			{
				f=f*a;
				a--;
			}
			return f;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n and x");
		int n=sc.nextInt();
		int x=sc.nextInt();
		int i=0,s=0;
		for(i=0;i<=n;i++)
		{
			s+=Math.pow(x, i)/fact(i);
		}
		System.out.println("Sum of series is "+s);
	}

}
