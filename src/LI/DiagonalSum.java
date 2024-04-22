package LI;

public class DiagonalSum {
	public static void main(String[] args) {
		int[][] a = { { 1, 1, 0, 0 }, {1,0,0,1 }, {0,1,1,1 }, { 1,0,1,0 } };
		inverted(a);
		int rows = a.length;
		int cols = a[0].length;
		int finalAns = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == j || j == rows - 1 - i) {
					finalAns = finalAns + a[i][j];
				}

			}
		}
		System.out.println(finalAns);
	}

	private static void inverted(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length / 2; j++) {
				int temp = a[i][j]^1;
				a[i][j] = a[i][a.length - 1 - j]^1;
				a[i][a.length - 1 - j] = temp;

			}
		}
	}
}
