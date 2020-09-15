package assignment1;
import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int m=num/2;
		
		if(num==0||num==1)
			System.out.println("not prime");
		for(int i=2;i<m;i++)
		{
			if(num%i == 0)
			{System.out.println("It is prime");
			flag =1;
			break;
			}
			
		}
		
		if(flag==0)
			System.out.println("Not prime");
		
		
		
	}

}
