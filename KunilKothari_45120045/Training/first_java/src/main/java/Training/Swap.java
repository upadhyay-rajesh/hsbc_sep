package Training;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=10;
		System.out.println("The original numbers are :"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The swapped numbers are :"+a+" "+b);

	}

}
