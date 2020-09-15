package assignment1;
import java.util.Scanner;

public class GradeAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter student's percentage");
		Scanner sc=new Scanner(System.in);  
		int p= sc.nextInt();
		
	
		
		switch(p/10)
		{
		case 10:
		case 9: System.out.println("A+ grade awarded");
				break;
		case 8:System.out.println("A grade awarded");
				break;
		case 7:System.out.println("B+ grade awarded");
				break;
		case 6:System.out.println("B+ grade awarded");
				break;
		case 5:System.out.println("C+ grade awarded");
				break;
		case 4:
		case 3:
		case 2:
		case 1:
		case 0: 
		default: System.out.println("Failed");
				break;
				
		}
	
	
	}

}
