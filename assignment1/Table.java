package assignment1;
import java.util.*;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your no ");
		int x= sc.nextInt();
		int j;
		System.out.println("the table is as follows ");
		for(j=1;j<=12;j++)
		{
			System.out.println(x+"*"+j+"="+(x*j));
		}
	}

}
