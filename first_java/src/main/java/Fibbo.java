
public class Fibbo {

	public static void main(String[] args) {
		int i=0;
		int j=1;
		int sum=i+j;
		System.out.print(i+" "+ j+ " ");
		for(int k=1; k<20; k++)
		{
			System.out.print(sum+" ");
			i=j;
			j=sum;
			sum=i+j;
			//System.out.println((sum=+k)
		}
	}

}
