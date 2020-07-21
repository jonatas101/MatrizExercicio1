package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Matrix size");
		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Line: " + i + ", column: " + j);
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("Which number do you wanna locate? ");
		int x = sc.nextInt();
		int pos = 1;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == x) {

					System.out.println(" Position: " + pos + " (" + i + ", " + j + ")");
					pos++;
					// left position
					if (j != 0) {
						System.out.println("Left: " + mat[i][j - 1]);
						
					}
					// up position
					if (i != 0) {
						System.out.println("Up: " + mat[i - 1][j]);
						
					}
					// Right position
					if (j != n-1) {
						System.out.println("Right: " + mat[i][j + 1]);
						
					}
					// Down position
					if (i != m-1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
