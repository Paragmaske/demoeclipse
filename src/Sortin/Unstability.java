package Sortin;

import java.util.Arrays;
import java.util.Scanner;

public class Unstability {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int[] a = new int[2*in];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		int doubleShips = in - 1;
		int singleShips = 2;
		// 1 1| 2 2
		// 1| 1 2
		int ans = 0;
		for (int i = a.length - 3; i >= 0; i=i-2) {
			if (i >= 0 && i - 1 >= 0) {
				ans = ans + Math.abs(a[i] - a[i - 1]);
			} else if (i >= 0 && i - 1 < 0) {
				ans=ans+a[i];
			}
		}
		System.out.println(ans);
	}
}
