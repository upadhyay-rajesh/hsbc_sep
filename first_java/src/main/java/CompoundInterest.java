
public class CompoundInterest {
	static double ci(int p, int r, int t) {
		double amt= p*(Math.pow(1+r/100.0,t));
		return (amt-p);
	}
	public static void main(String[] args) {
		
		int principal=12500;
		int rate=5;
		int time=2;
		
		System.out.println("Compound Interest is "+ci(principal,rate,time));

	}


}
