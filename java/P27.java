
import java.io.*;
public class P27 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number");
		int p = Integer.parseInt(br.readLine());
		for(int j=1;j<=p;j++)
		{
			for(int k=1;k<=j;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		

	}

}
