package com.first_java;

public class Grade {

	public static void main(String[] args) {
		System.out.println("Students Percentage is:"+args[0]);
		float per = Float.parseFloat(args[0]);
		if(per<40.0)
			System.out.println("Grade:F");
		if((per>40.0)&&(per<50.0))
			System.out.println("Grade:E");
		if((per>50.0)&&(per<60.0))
			System.out.println("Grade:D");
		if((per>60.0)&&(per<70.0))
			System.out.println("Grade:C");
		if((per>70.0)&&(per<80.0))
			System.out.println("Grade:B");
		else
				System.out.println("Grade:A");

	}

}
