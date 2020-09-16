package com.homework_java;

public class average {

	public static void main(String[] args) {
int a[]= {1,2,3,4,5,6};int i;
double total=0.0d;

for(i=0;i<a.length;i++)
{
	total=total+a[i];
}

double avg;
avg=total/a.length;

System.out.println("Average is "+avg);

	}

}
