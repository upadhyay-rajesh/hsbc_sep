
import java.io.*;
public class P15 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no1");
		int r = Integer.parseInt(br.readLine());
		System.out.println("Enter no2");
		int r2 = Integer.parseInt(br.readLine());
		r=r+r2;
		r2=r-r2;
		r=r-r2;
		System.out.println("no1 "+r);System.out.println("no2 "+r2);

	}

}