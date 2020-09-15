package Assignments;

public class Assign27 {
	
	public static void main(String[] args)
	{
		int i,j;
		int[] arr=new int[4];
		for(i=1;i<5;i++)
		{
			arr[i-1]=i;
		}
		for(i=0;i<5;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}

}
