import java.util.*;
public class Third {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	if(num>60) {
		System.out.println("First Division");
	}
	else if(num>45&&num<=60) {
		System.out.println("Second Division");
	}
	else if(num>=33&&num<=45) {
		System.out.println("Third Division");
	}
	else {
		System.out.println("Fail");
	}
}
}
