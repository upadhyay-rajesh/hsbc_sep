
import java.io.*;
public class P23 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter p,r,t");
		int p = Integer.parseInt(br.readLine());
		int r = Integer.parseInt(br.readLine());
		int t = Integer.parseInt(br.readLine());
		double s=p*r*t;
		double si=s/100;
		System.out.println("simple interest :"+si);
	}

}
