package com.first_javas;

public class Hi {
	int i;
	static int k;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=9;
		System.out.println("welcome");
		Hi h = new Hi();
		System.out.println(h.i);//since its non static it can't be used in static main without object
		System.out.println(j);//you have to give value to it 
		System.out.println(k);
		long l1= 5;
		int i2=9;
		int i3= (int)l1*5;//exp
		long l2=i2*10;//imp

	}

}
