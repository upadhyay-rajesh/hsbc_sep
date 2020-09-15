
public class DeterminantMatrix {

	public static void main(String[] args) {
		int mat1[][]={{1,3,1},{4,6,7},{1,4,3}};    
		
		int det = mat1[0][0] * ((mat1[1][1]*mat1[2][2]) - (mat1[2][1]*mat1[1][2])) -mat1[0][1] * (mat1[1][0] * mat1[2][2] - mat1[2][0] * mat1[1][2]) + mat1[0][2] * (mat1[1][0] * mat1[2][1] - mat1[2][0] * mat1[1][1]);
		
		System.out.println("Determinant of Matrix is "+ det);

	}

}
