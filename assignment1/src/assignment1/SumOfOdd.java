package assignment1;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=1; i<100; i++)
		{
			if(i%2!=0)
				sum=sum+i;
		}
		System.out.println("Sum of odd no.s from 1 to 99:"+ sum);
	}

}
