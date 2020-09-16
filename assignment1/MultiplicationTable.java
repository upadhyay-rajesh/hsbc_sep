package assignment1;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		System.out.println("Multiplication table of "+n+" is ");
		for(int i=1;i<=12;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
	}

}
