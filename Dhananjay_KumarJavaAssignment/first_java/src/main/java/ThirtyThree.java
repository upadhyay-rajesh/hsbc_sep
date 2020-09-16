import java.util.Scanner;
	public class ThirtyThree
	{   public static void CalcAvg(int a[],int n) {
		int sum=0;
		float average=0.0f;
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
	       }
	    public static void main(String[] args) 
	    {
	        int n=0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n ; i++)
	        {
	            a[i] = s.nextInt();
	          
	        }
	        CalcAvg(a,n);
	    }
	}