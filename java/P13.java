
import java.io.*;
public class P13 {

	public static void main(String[] args)throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter radius");
		int r = Integer.parseInt(br.readLine());
		float a=22/7*r*r;
		System.out.println("area is "+a);


	}

}
