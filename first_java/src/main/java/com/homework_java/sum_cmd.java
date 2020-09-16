package com.homework_java;

public class sum_cmd {

	public static void main(String[] args) {

int i=0,sum=0;
int n=Integer.parseInt(args[0]);
while(i<=n)
{
sum = sum+i;
i++;


}
System.out.println("sum is = " + sum);
}
}
