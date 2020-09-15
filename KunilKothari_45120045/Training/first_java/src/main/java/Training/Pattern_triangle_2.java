package Training;

public class Pattern_triangle_2 {

	public static void main(String[] args) {
		int x=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(int k=x;k>1;k--) {
				
				System.out.print(k);
			}
			x++;
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				
			}
			
			System.out.println();
		}

	}

}
