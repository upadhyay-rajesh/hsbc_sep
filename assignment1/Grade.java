package assignment1;
import java.util.*;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]= new int[5];
		float total=0,avg;
		Scanner sc= new Scanner(System.in);
		int i;
		System.out.println("Enter marks of 5 subjects ");
		for(i=0;i<5;i++)
		{
			marks[i]=sc.nextInt();
			total+=marks[i];
		}
		avg=total/5;
		System.out.println("The grade is ");
		if(avg>=90)
		{
			System.out.println("A");
		}
		else if(avg>=75)
		{
			System.out.println("B");
		}
		else if(avg>=60)
		{
			System.out.println("C");
		}
		else if(avg>=40)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("E");
		}
	}

}
