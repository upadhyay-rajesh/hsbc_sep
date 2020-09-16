package assignment1;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,a=0,b=1,c=0;
		System.out.println(a);
		System.out.println(b);
		while((a+b)<20)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}

}
