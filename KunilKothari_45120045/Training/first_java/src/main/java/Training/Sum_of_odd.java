package Training;

public class Sum_of_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=99;i++)
		{
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of odd numbers between 1-99:"+sum);
	}

}
