package Sortin;

import java.util.Arrays;
import java.util.Scanner;

public class CowsArrival {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int[][] cows = new int[a][2];
		for (int i = 0; i < cows.length; i++)

		{
			cows[i][0] = sc.nextInt();
			cows[i][1] = sc.nextInt();
		}

		Arrays.sort(cows, (c, d) -> c[0] - d[0]);

//		3
//		2 1
//		8 3
//		5 7
// sorted seq 2 1 ||  5 7 || 8 3 
		int time = 0;
		for (int i = 0; i < cows.length; i++) {
			if (i == 0) {
				time = cows[i][0] + cows[i][1];
			} else {
				if (time <= cows[i][0]) {
					time = cows[i][0] + cows[i][1];
				} else {
					time = time + cows[i][1];
				}
			}

		}

		System.out.println(time);
	}
}
