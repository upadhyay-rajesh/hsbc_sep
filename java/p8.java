
import java.io.*;
public class p8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter No");
		int t = Integer.parseInt(br.readLine());
		int r=0,d;
		while(t>0)
		{
			d=t%10;
			r=r*10+d;
			t=t/10;
		}
		System.out.println("Reversed "+r);
	}

}
