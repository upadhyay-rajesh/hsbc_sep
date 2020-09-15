package assignment1;

public class SumOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		int sum=0;
		
		for(int i=1; i<=num; i++)
			sum= sum+i;
		System.out.println(sum);
		

	}

}
