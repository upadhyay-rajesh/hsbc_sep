
import java.io.*;
public class P11 {

	public static void main(String[] args)throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number");
		int t = Integer.parseInt(br.readLine());
		int fact=1;
		for(int i=1;i<=t;i++)
			fact=fact*i;
		System.out.println("factorial is "+fact);

	}

}
