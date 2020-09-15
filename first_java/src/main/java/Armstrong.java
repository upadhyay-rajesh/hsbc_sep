
public class Armstrong {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int no=n;
		int l=0;
		int sum=0;
		
		while(n!=0)
		{
			int d=n%10;
			l=d*d*d;
			sum=l+sum;
			n=n/10;
		}
		
		if(sum==no)
			System.out.println(no+ " is a Armstrong Number");
		else
			System.out.println(no+ " is not a Armstrong Number");
	}

}
