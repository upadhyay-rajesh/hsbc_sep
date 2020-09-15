package rkdgr8;

public class Q6 {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		boolean isPrime=true;
		for(int i=2; i<n; i++){
			if(n%i == 0 )
			{
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime ? "prime" : "not prime");
	}

}
