package com.questions;
import java.util.*;
class SI{
	int n,p;
	float r;
	SI(int n,int p, float r)
	{
		this.n=n;
		this.p=p;
		this.r=r;
	}
	float calculate()
	{
		return (n*p*r)/100;
	}
}
public class Ques23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,p;
		float r;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter principal amount");
		p=obj.nextInt();
		System.out.println("Enter number of years");
		n=obj.nextInt();
		System.out.println("Enter rate of interest");
		r=obj.nextFloat();
		SI si=new SI(n,p,r);
		System.out.println("Simple Interest: "+si.calculate());

	}

}
/*Enter principal amount
40000
Enter number of years
5
Enter rate of interest
0.5
Simple Interest: 1000.0
*/
