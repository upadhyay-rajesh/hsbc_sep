

package com.homework_java;

public class grade {

	
	public static void main(String[] args) {
		
		int j;
		
	System.out.print("Enter marks");
	j=86;
	System.out.println("\n marks are = "+j);
	
	if(j>=0 && j <=40)
	{
		System.out.print("Grade is FAIL");
	}
	else
		if(j>=41 && j<=60)
		{
			System.out.println("grade is 2nd Class");
		}
			else
				if(j>=61 && j<=101)
				{
					System.out.println("grade is 1st Class");
				}
		

	}

}
