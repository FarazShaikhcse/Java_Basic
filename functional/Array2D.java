package com.yml.functional;

import java.util.Scanner;

public class Array2D {

		public static void array2D() {
			int m, n, i, j;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of rows");
			m = scanner.nextInt();
			System.out.println("Enter the number of columns");
			n = scanner.nextInt();

			
			int matrix[][] = new int[m][n];


			System.out.println("Enter the elements of the matrix");
			for (i = 0; i < m; i++)
				for (j = 0; j < n; j++)
					matrix[i][j] = scanner.nextInt();

			System.out.println("Elements of the matrix are");
			for (i = 0; i < m; i++) {
				for (j = 0; j < n; j++)
					System.out.print(matrix[i][j] + "  ");
				System.out.println();
			}
			scanner.close();
		}
}
