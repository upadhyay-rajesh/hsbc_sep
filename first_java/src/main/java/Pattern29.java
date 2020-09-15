
public class Pattern29 {

	public static void main(String[] args) {
		for(int i =1; i<5; i++)
		{
			for(int j=1; j<2*(5-i); j++)
				System.out.print(" ");
			
			for(int j=i; j>0; j--)
				System.out.print(j+" ");
			
			for (int j = 2; j <= i; j++) 
				System.out.print(j+" " );
			System.out.println();
		
		}
		for (int i = 1; i <= 3; i++)
		{

			for (int j=0; j<=2*i; j++) 
				System.out.print(" ");
			
			for (int j=4-i; j>0; j--) 
				System.out.print(j + " ");
	
			for (int j=2; j<=4-i; j++) 
				System.out.print(j + " ");

			System.out.println();
		
		}
	}

}
