
import java.io.*;
import java.math.*;
public class P25 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number");
		int p = Integer.parseInt(br.readLine());
		
		double sqt = Math.sqrt(p);
		System.out.println(sqt);
	}

}
