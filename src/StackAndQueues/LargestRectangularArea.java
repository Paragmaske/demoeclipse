package StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

class Mix {
	int ele;
	int index;

	Mix(int ele, int index) {
		this.ele = ele;
		this.index = index;
	}
}

public class LargestRectangularArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ai = sc.nextInt();
		int[] a = new int[ai];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		// for left side
		int[] ansAreaAtIndexFromLeft = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			int currentImdexEle = a[i];
			for (int j = i; j >= 0; j--) {
				if (currentImdexEle <= a[j]) {
					count++;
				} else {
					break;
				}

			}
			ansAreaAtIndexFromLeft[i] = ansAreaAtIndexFromLeft[i] + a[i] * (count);
			// System.out.print(ansAreaAtIndexFromLeft[i] +" ");
		}

		// for right side

		int[] ansAreaAtIndexFromRight = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			int currentImdexEle = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (currentImdexEle < a[j]) {
					count++;
				} else {
					break;
				}

			}
			ansAreaAtIndexFromRight[i] = ansAreaAtIndexFromRight[i] + a[i] * (count);
			// System.out.print(ansAreaAtIndexFromRight[i] +" ");
		}
		for (int i = 0; i < ansAreaAtIndexFromLeft.length; i++) {
			ansAreaAtIndexFromLeft[i] = ansAreaAtIndexFromLeft[i] + ansAreaAtIndexFromRight[i];
		}
		int max = Integer.MIN_VALUE;
		for (int i : ansAreaAtIndexFromLeft) {
			if (i > max) {
				max = Math.max(i, max);
			}
		}
		System.out.println(max);
	}

}