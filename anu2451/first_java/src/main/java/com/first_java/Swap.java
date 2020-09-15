package com.first_java;

public class Swap {

	public static void main(String[] args) {
		System.out.println("First Number:"+args[0]);
		System.out.println("Second Number:"+args[1]);
		int fnum=Integer.parseInt(args[0]);
		int snum=Integer.parseInt(args[1]);
		fnum=fnum+snum;
		snum=fnum-snum;
		fnum=fnum-snum;
		System.out.println("After Swap");
		System.out.println("First Number:"+fnum);
		System.out.println("Second Number:"+snum);

	}

}
