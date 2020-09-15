
import java.io.IOException;
import java.io.*;
import java.math.*;

public class P24 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter p,r,t");
		int p = Integer.parseInt(br.readLine());
		double r = Double.parseDouble(br.readLine());
		int t = Integer.parseInt(br.readLine());
		double amt=p*Math.pow((1+(r/100)),t);
		double ci=amt-p;
		System.out.print("CI is "+ci);

	}

}
