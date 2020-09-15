package com.first_java;

public class matrix_add_sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 2, columns = 3;
        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
        int[][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        int[][] sub = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                sub[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
            }
        }
	}

}
