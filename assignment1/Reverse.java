package assignment1;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,s=0,r;
		System.out.println("Enter num");
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		System.out.println("reverse is "+s);
	}

}
