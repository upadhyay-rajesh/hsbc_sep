
public class SubtractMatrix {

	public static void main(String[] args) {
		int mat1[][]={{1,3,1},{4,6,7},{1,4,3}};    
		int mat2[][]={{5,1,6},{42, 7,2},{7,5,9}};  
		
		int diff[][]=new int[3][3];
		
		
		
		for(int i=0; i<mat1.length; i++)
		{
			for(int j=0; j<mat2.length; j++)
			{
			
				diff[i][j]=mat1[i][j]-mat2[i][j];
				System.out.print(diff[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
