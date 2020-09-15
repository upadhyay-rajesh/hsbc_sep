
import java.io.*;
public class P20 {

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
		for(int k=0;k<n;k++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("Ascending");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
