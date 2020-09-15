
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		int c=a+b;
		System.out.println(a);
		System.out.println(b);
		while(c<=20)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}

	}

}
