
import java.io.*;
public class P26 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number");
		int p = Integer.parseInt(br.readLine());
		
		double sqt = p*p;
		System.out.println(sqt);
	}

}
