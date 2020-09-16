package assignment1;

public class SumOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		int i=1,s=0;
		while(i<=n)
		{
			s+=i;
			i++;
		}
		System.out.println("Sum is "+s);
	}

}
