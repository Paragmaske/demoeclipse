package LI;

import java.util.Arrays;

public class DeleteGreatestValue {
	public static void main(String[] args) {
		int[][] a = { { 9,81 },{33,17} };

		System.out.println(deleteGreatest(a));
		// selectionSort(a);
		// bubbleSort(a);

	}

	private static int deleteGreatest(int[][] a) {
		
		for(int[] i:a) {
			Arrays.sort(i);
		}
		int maxsum = 0;
		for (int i = 0; i < a[0].length; i++) {
			int max=0;
			for (int j = 0; j < a.length; j++) {
				 max = Math.max(max, a[j][i]);
			}
			maxsum = maxsum + max;
		}
		return maxsum;
	}

	private static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			boolean swap = false;
			for (int j = 0; j < a.length - 1 - i; j++)

			{
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swap = true;
				}
			}
			if (!swap) {
				break;
			}
		}

		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	private static void selectionSort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++)

			{
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

	}
}
