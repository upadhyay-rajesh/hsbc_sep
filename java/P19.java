
//1+(x^1)/1!+(x^2)/2!+(x^3)/3!+...+(x^n)n!
import java.math.*;
import java.io.*;
public class P19 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter x");
		int x = Integer.parseInt(br.readLine());
		System.out.println("Enter limit");
		int n = Integer.parseInt(br.readLine());
		int fac=1;
		
		double s=0;
		for(int i=0;i<n+1;i++)
		{	
			fac=1;
			
			for(int j=1;j<i+1;j++)
				{fac=fac*j;}
			s=s+(Math.pow(x, i)/fac);
		}
		System.out.println("answer"+s);

	}

}
