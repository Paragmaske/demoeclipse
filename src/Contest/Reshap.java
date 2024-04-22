package Contest;

import java.util.Scanner;

public class Reshap {
	public static void main(String[] args) {
		int a = 4;
		Scanner sc = new Scanner(System.in);
		int[] in = new int[4];
		for (int i = 0; i < in.length; i++) {
			in[i] = sc.nextInt();
		}
		int inr = in[0];
		int inc = in[1];
		int ansr = in[2];
		int ansc = in[3];
		int[][] given = new int[inr][inc];
		int[][] ans = new int[ansr][ansc];

		for (int i = 0; i < inr; i++) {
			for (int j = 0; j < inc; j++) {
				given[i][j] = sc.nextInt();
			}
		}

		if ((inr * inc) > (ansr * ansc)) {
			for (int i = 0; i < inr; i++) {
				for (int j = 0; j < inc; j++) {
					System.out.print(given[i][j] + " ");
				}
				System.out.println();
			}
			System.exit(0);
		} else {
			int r = 0, c = 0;
			for (int i = 0; i < ansr; i++) {
				for (int j = 0; j < ansc; j++) {
					if (c == given[0].length) {
						c = 0;
						r = r + 1;
					}
					ans[i][j] = given[r][c];
					c++;

				}
			}
			for (int i = 0; i < ansr; i++) {
				for (int j = 0; j < ansc; j++) {
					System.out.print(ans[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
