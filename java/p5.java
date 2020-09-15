import java.io.*;
public class p5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter table NO");
		int t = Integer.parseInt(br.readLine());
		
		System.out.println("table");
		for(int i=1;i<=10;i++)
		{
			System.out.println(t+"x"+i+"="+t*i);
		}
			

	}

}
