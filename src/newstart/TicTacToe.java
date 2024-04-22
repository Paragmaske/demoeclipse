package newstart;

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		int[][] a = new int[3][3];

		Scanner sc = new Scanner(System.in);
		for (int m = 0; m < 9; m++) {
			System.out.println("Enter row col and symbol!!");
			int row = sc.nextInt();
			int col = sc.nextInt();
			int sym = sc.nextInt();

			a[row][col] = sym;
			boolean flag = false;
			for (int j = 0; j < 2; j++) {
				if (a[row][j] == a[row][j + 1]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			for (int i = 0; i < 2; i++) {
				if (a[i][col] == a[i + 1][col]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}

			if ((row == 0 && col == 0) || (row == 2 && col == 2)) {
				{
					for (int i = 0; i < 2; i++) {
						if (a[i][i] == a[i + 1][i + 1]) {
							flag = true;
						} else {
							flag = false;
							break;
						}
					}
				}

			}
			if ((row == 0 && col == 2) || (row == 2 && col == 0)) {
				{
					int c = 2;
					for (int i = 0; i < 2; i++) {
						if (a[i][c] == a[i + 1][c - 1]) {
							flag = true;
						} else {
							flag = false;
							break;
						}
					}
				}

			}
			for (int j = 0; j < 3; j++) {
				for (int i = 0; i < 3; i++) {
					System.out.print(a[j][i] + " ");
				}
				System.out.println();
			}
			if (flag) {
				System.out.println("SYMBOL :: " + sym + " WON!!!");
			}
		}
	}
}
