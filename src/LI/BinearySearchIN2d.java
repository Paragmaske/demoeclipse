package LI;

public class BinearySearchIN2d {
	private static void binarySearch(int[] a, int start, int end, int element, int i) {

		int mid = start + (end - start) / 2;
		if (start <= end) {
			if (element == a[mid]) {
				System.out.println("row " + i + "column" + mid);
				return;
			} else if (a[mid] > element) {
				binarySearch(a, start, mid - 1, element,i);
			} else {
				binarySearch(a, mid + 1, end, element,i);

			}
		} else {
			System.out.println("element not found");
			return;
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		searchIn2d(matrix, 3, 3, 21);
	}

	private static void searchIn2d(int[][] matrix, int col, int row, int target) {

		for (int i = 0; i < row; i++) {

		
			if (target >= matrix[i][0] && target <= matrix[i][col - 1]) {
				binarySearch(matrix[i], 0, col - 1, target, i);
			}
			

		}
	}
}
