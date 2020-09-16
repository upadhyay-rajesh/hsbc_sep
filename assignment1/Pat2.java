package assignment1;

public class Pat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=4;i++)
	    {
	        for(j=1;j<=4-i;j++)
	        {
	            System.out.print(" ");;
	        }

	        for(j=i;j>=1;j--)
	        {
	            System.out.print(j);
	        }

	        for(j=2;j<=i;j++)
	        {
	        	System.out.print(j);
	        }
	        System.out.println();
	    }
	}

}
