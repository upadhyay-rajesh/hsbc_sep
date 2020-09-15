import java.io.*;
import java.util.Scanner;
public class p3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter marks");
		int t = Integer.parseInt(br.readLine());
		if(t>80)
			System.out.println("A");
		else if(t>60 && t<=80)
			System.out.println("B");
		else
			System.out.println("C");
		

	}

}
