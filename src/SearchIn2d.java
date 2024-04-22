import java.util.Scanner;

public class SearchIn2d {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int search = sc.nextInt();
		int[][] a = new int[row][col];
		int[] searchArray = new int[search];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int k = 0; k < search; k++) {
			searchArray[k] = sc.nextInt();
		}

		for (int k : searchArray) {
			search2d(a, k);
		}
	}

	private static void search2d(int[][] a, int target) {
		int left = 0;
		int right = (a[0].length * a.length) - 1;
		int ansRow = -1, ansCol = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int row = mid / a[0].length;
			int col = mid % a[0].length;

			if (a[row][col] == target) {
				System.out.println(row + " " + col);
				return;
			} else if (a[row][col] < target) {
				left = mid + 1;

			} else {
				right = mid - 1;
			}
		}

		if (ansCol == -1) {
			System.out.println(" -1  -1");
		}
	}
}
