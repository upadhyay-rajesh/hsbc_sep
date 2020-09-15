
public class SimpleInterest {
	
	static double si(int p, int r, int t) {
		return ((p*r*t)/100);
	}
	public static void main(String[] args) {
		
		int principal=1000;
		int rate=10;
		int time=2;
		
		System.out.println("Simple Interest is "+si(principal,rate,time));

	}

}
