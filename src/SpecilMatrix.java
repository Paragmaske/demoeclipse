import java.util.Scanner;

public class SpecilMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// taking input
		int xrow = sc.nextInt();
		long[][] input = new long[xrow][xrow];
		for (int i = 0; i < xrow; i++) {
			for (int j = 0; j < xrow; j++) {
				input[i][j] = sc.nextLong();
			}
		}

		// calculating max sum for all rows
		long maxRowSum = Integer.MIN_VALUE;
		for (int i = 0; i < xrow; i++) {
			long windowRowSum = 0;
			for (int j = 0; j < xrow; j++) {
				windowRowSum = windowRowSum + input[i][j];
			}
			maxRowSum = Math.max(maxRowSum, windowRowSum);
		}

		long[] rowSum = new long[xrow];
		long[] colSum = new long[xrow];
		// calculating each row sum and storing in array
		for (int i = 0; i < xrow; i++) {
			long totalRowSum = 0;
			for (int j = 0; j < xrow; j++) {
				totalRowSum = totalRowSum + input[i][j];
			}
			rowSum[i] = totalRowSum;
		}

		// calculating each col sum and storing in array
		for (int i = 0; i < xrow; i++) {
			long totalColSum = 0;
			for (int j = 0; j < xrow; j++) {
				totalColSum = totalColSum + input[j][i];
			}
			colSum[i] = totalColSum;
		}
		// iterating over 2d matrix and incrementing value of element such that
		// it stays within maxLimit for both column and row
		int finalAns = 0;
		for (int i = 0; i < xrow; i++) {
			for (int j = 0; j < xrow; j++) {
				long maxWeCanAdd = Math.min(maxRowSum - rowSum[i], maxRowSum - colSum[j]);

				finalAns = (int) (finalAns + maxWeCanAdd);
				rowSum[i] = rowSum[i] + maxWeCanAdd;
				colSum[j] = colSum[j] + maxWeCanAdd;
			}

		}

		System.out.println(finalAns);

	}
}
