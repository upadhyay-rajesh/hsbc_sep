package com.first_java;

public class TableUsingCmd {

	public static void main(String[] args) {
		
		int num;
		
		num=Integer.parseInt(args[0]);
		
		for(int i = 1; i <= 10; ++i)
        {
        	int p=num*i;
            System.out.println(num + " x " + i + " = " + p);
        }

	}

}
