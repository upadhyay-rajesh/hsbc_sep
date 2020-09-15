
public class SumN {

	public static void main(String[] args) {
		int l=args.length;
		int sum=0;
		while(l!=0)
		{
			int n=Integer.parseInt(args[0]);
			sum=sum+n;
			l--;
		}
		System.out.println("Sum of "+ args.length+" numbers is "+ sum);
	}

}
