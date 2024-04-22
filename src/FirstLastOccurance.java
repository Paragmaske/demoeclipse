import java.util.Scanner;

public class FirstLastOccurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] input = new int[a];
		int b = sc.nextInt();
		int[] search = new int[b];

		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		for (int i = 0; i < search.length; i++) {
			search[i] = sc.nextInt();
		}

		for (int i : search) {
			System.out.println(firstOcuurance(input, i) + " " + LastOcuurance(input, i));
		}
	}

	public static int helperFunction(int ele, int target) {
		if (ele < target) {
			return 0;
		}
		return 1;
	}

	private static int firstOcuurance(int[] a, int target) {

		int left = -1;
		int right = a.length;

		while (right - left > 1) {
			int mid = left + (right - left) / 2;

			if (helperFunction(a[mid], target) == 0) {
				left = mid;
			} else {
				right = mid;
			}
		}
		if (a.length == right)
			return -1;
		else if (a[right] == target) {
			return right;
		} else {
			return -1;
		}
	}

	private static int LastOcuurance(int[] a, int target) {

		int left = -1;
		int right = a.length;

		while (right - left > 1) {
			int mid = left + (right - left) / 2;

			if (helperFunctionLast(a[mid], target) == 0) {
				left = mid;
			} else {
				right = mid;
			}
		}
		if (left < 0) {
			return -1;
		} else if (a[left] == target) {
			return left;
		} else {
			return -1;
		}
	}

	private static int helperFunctionLast(int i, int target) {
		// TODO Auto-generated method stub

		if (i <= target) {
			return 0;
		}
		return 1;

	}
}
