
public class AverageOfN {

	public static double avg(int a[])
	{
		int l=a.length;
		int sum=0;
		for(int i=0; i<l; i++)
			sum+=a[i];
		
		return ((double)sum/l);
	}
	public static void main(String[] args) {
		int a[]= {1,2,4,6,3,2,5,4,2,1,43,53,76};
		//Average ab=new Average();
		System.out.println("Average of the numbers is "+ avg(a));

	}

}
