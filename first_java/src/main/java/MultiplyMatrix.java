
public class MultiplyMatrix {

	public static void main(String[] args) {
		int mat1[][]={{1,3,1},{4,6,7},{1,4,3}};    
		int mat2[][]={{5,1,6},{42, 7,2},{7,5,9}};  
		
		int mul[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{    
			for(int j=0;j<3;j++)
			{    
				mul[i][j]=0;      
				for(int k=0;k<3;k++)      
				{      
					mul[i][j]+=mat1[i][k]*mat2[k][j];      
				}
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
	}

}
