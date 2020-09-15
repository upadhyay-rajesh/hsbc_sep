import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
public class P21 {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int order=3;
        int[][] matrix=new int[3][3];
        System.out.println("Enter the elements of 3x3 matrix");
        int i,j;
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                
                    matrix[i][j]=Integer.parseInt(br.readLine());
                }
            
        }
        int determinant,x,y,z;
        x=(matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]));
        y=(matrix[0][1] * (matrix[1][0] * matrix[2][2]
                       - matrix[1][2] * matrix[2][0]));
        z=(matrix[0][2] * (matrix[1][0] * matrix[2][1]
                       - matrix[1][1] * matrix[2][0]));
        determinant= x - y + z;
        System.out.println("The modulus of the given matrix is "+ determinant);
 

	}

}
