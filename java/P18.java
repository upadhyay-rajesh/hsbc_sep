
import java.io.*;
public class P18 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number");
		int n = Integer.parseInt(br.readLine());
		int t=n,d,r=0;
		while(n!=0)
		{
			d=n%10;
			r=r+d*d*d;
			n=n/10;
		}
		if(r==t)
			System.out.println("armstrong ");
		else
			System.out.println("non armstrong ");


	}

}
