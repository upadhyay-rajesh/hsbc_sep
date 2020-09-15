package rkdgr8;

public class Q4 {

	public static void main(String[] args) {
		int a=1,b=1,fib;
		System.out.println(a);
		System.out.println(b);
		while(a+b <= 20) {
			fib = a+b;
			System.out.println(fib);
			a=b;
			b=fib;
		}
	}

}
