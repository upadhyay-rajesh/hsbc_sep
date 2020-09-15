package assignment1;

public class Fibonacci {

	public static void main(String[] args) {
		
		int i=0;
		int j=1;
		int count =20;
		int sum=0;
		
		System.out.print(i+" "+j+" ");
		for(int k=2; sum<20;k++)
		{
			sum= i+j;
			System.out.print(sum+" ");
			i=j;
			j=sum;
			
		}
		
		
	}
}
