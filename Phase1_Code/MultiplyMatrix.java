package com.mahajan;

public class MultiplyMatrix {
	public static void main(String [] args) {
		int r1 = 2, c1 = 3;
		int r2 = 3, c2 = 2;
		int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
		int[][] secondMatrix = { {5, 9}, {7, 8}, {0, 4} };
		
		int[][] productofMatrix = new int[r1][c2];
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c2; j++) {
				for(int k = 0; k < c1; k++) {
					productofMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}
		
		System.out.println("Multiplication of two Matrix is : ");
		for(int[] row : productofMatrix) {
			for(int column : row) {
				System.out.println(column + " ");
			}
			System.out.println();
		}
	}
}
