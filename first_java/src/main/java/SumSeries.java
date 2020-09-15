
public class SumSeries {

	public static void main(String[] args) {
		int x=4;
		int n=5;
		
		int fact[] =new int[10];
		fact[0]=1;
		for(int i=1; i<=n; i++)
			fact[i]=fact[i-1]*i;
		
		double sum=0;
		for(int i=0; i<=n; i++)
			sum=sum+ (Math.pow(x,i)/fact[i]);
		System.out.println("Sum of the series is "+sum);
	}

}
