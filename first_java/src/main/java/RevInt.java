
public class RevInt {

	public static void main(String[] args) {
		int n=2761;
		int a=0; 
		while(n!=0)
		{
			a=10*a+n%10;
			n=n/10;
			
		}
		System.out.println(a);
		
	}

}
