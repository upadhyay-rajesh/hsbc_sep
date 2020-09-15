import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number");
		int no=sc.nextInt();
		int c=0;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				c=c+1;
			}
		}
		
		if(c==2) {
			System.out.println("Its a prime number");
		}
		else {
			System.out.println("Its not a prime number");
		}

	}

}
