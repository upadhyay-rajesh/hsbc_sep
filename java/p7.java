
import java.io.*;
public class p7 {

	public static void main(String[] args) throws IOException {
		
		
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length");
		int t = Integer.parseInt(br.readLine());
		int a[] = new int[t];
		int s=0;
		System.out.println("Enter nos");
		for(int i=0;i<t;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
			s=s+a[i];
		}
		System.out.println("averge"+s/t);
			
	}

}
