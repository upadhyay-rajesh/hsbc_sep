package assignment1;

public class OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,s=0;
		for(i=1;i<=99;i++)
		{
			if(i%2==0)
				s+=i;
		}
		System.out.println("Sum of odd integers between 1 and 99 is "+s);
	}

}
