
public class CheckPrime {

	public static void main(String[] args) {
		int n=23;
		
		for(int i=2; i*i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.println("NUmber is Not Prime");
				return;
			}
		}
		
		System.out.println("Number is Prime");
	}

}
