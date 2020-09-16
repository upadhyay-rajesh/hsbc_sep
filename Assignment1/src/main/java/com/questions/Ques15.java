package com.questions;
import java.util.*;
public class Ques15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
System.out.println("Enter two numbers");
int num1=obj.nextInt();
int num2=obj.nextInt();
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println("Afer Swapping two numbers are: "+num1+" "+num2);
	}

}
/*
Enter two numbers
2 3
Afer Swapping two numbers are: 3 2
*/