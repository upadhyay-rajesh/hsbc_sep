package assignment1;
import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, n, temp, total = 0;
        System.out.println("Ënter 3 Digit Number");
        Scanner sc= new Scanner(System.in);
        num = sc.nextInt();
        n=num;
        while(n>0)
        {
            temp = n % 10;
            total = total + temp*temp*temp;
            n=n/10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
	}

}
