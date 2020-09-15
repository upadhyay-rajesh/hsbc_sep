
import java.io.*;
public class p10 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value in F");
		int t = Integer.parseInt(br.readLine());
		int c=(t-32)*(5/9);
		System.out.println("Value in Degree C "+c);

	}

}