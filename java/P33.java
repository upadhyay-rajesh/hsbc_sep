import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class P33 {
	static void average(int a[],int n)
	{	double s=0;
		for(int i=0;i<n;i++)
		{
			s=s+a[i];
		}
		s=s/n;
		System.out.println("Average ="+s);
		
	}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter len then enter element");
		int n = Integer.parseInt(br.readLine());
		int a[]= new int [n];int t;
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		average(a,n);

	}
	
}
