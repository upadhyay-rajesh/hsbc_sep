
public class SumOfOddInt {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=99; i++)
		{
			if(i%2!=0)
				sum+=i;
		}
		System.out.println("Sum of odd integers between 1 and 99 is "+sum);
	}

}
