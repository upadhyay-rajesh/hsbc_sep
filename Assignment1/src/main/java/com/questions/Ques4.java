package com.questions;
import java.util.*;
public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num2=1,num1=0,num3=0;
		for(int i=2;i<=20;i++)
		{
			System.out.print(num1+" ");
			num3=num1+num2;
			num1=num2;
			num2=num3;
		}
	}

}
/*
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 
*/