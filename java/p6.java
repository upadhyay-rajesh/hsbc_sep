
import java.io.*;
public class p6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter NO");
		int t = Integer.parseInt(br.readLine());
		
		int f=1;
		for(int i=1;i<t;i++)
		{
			if(t%i==0)
				f++;
		}
		if(f==2)
			System.out.println("Prime");
		else
			System.out.println("Not");
		

	}

}
