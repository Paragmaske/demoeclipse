import java.util.Arrays;
import java.util.Scanner;

public class QueriesInRange {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int array = sc.nextInt();
		int queries = sc.nextInt();
		int[] a = new int[array];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int[][] qua = new int[queries][2];
		for (int i = 0; i < qua.length; i++) {
			for (int j = 0; j < 2; j++) {
				qua[i][j] = sc.nextInt();
			}
		}
		Arrays.sort(a);
		for (int[] qu : qua) {
			funcq(qu, a);
		}
	}

	private static void funcq(int[] qu, int[] a) {
		int firstOccur = qu[0];
		int lastOcuur = qu[1];

		System.out.print(LastOcuurance(a, lastOcuur) - firstOcuurance(a, firstOccur) + 1 + " ");

	}

	private static int firstOcuurance(int[] a, int target) {
		int left = 0;
		int right = a.length - 1;

		while (left <= right) {

			int mid = (left + right) / 2;

			if (a[mid] >= target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;

	}

	private static int LastOcuurance(int[] a, int taget) {

		int left = 0;
		int right = a.length - 1;

		while (left <= right) {

			int mid = (left + right) / 2;

			if (a[mid] <= taget) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return right;

	}
}
