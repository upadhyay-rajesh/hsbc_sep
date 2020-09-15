package com.first_java;

public class Table {

	public static void main(String[] args) {
		System.out.println("Desired Number is:"+args[0]);
		int number = Integer.parseInt(args[0]);
		for(int i=1;i<=10;i++)
		{
			System.out.println(number+"*"+i+"="+number*i);
		}

	}

}
