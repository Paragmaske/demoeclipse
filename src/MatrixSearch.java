import java.util.Scanner;

public class MatrixSearch {
	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int row = sc.nextInt();
//		int col = sc.nextInt();
//		int s = sc.nextInt();
//		int[][] input = new int[row][col];
//
//		int[] search = new int[s];
//
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				input[i][j] = sc.nextInt();
//			}
//		}
//		for (int i = 0; i < s; i++) {
//			search2d(input, sc.nextInt());
//		}

		
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		search2dBinary(a, 4);
	}

	private static void search2dBinary(int[][] a, int target) {
//	1 2 3
//	4 5 6
//	7 8 9

		int left = -1;
		int right = a.length;
		while (right > left + 1) {

			int col=a[0].length-1;
			int mid =(left+right)/2;
			
			if(a[mid][col]>target)
			{
				left=mid;
			}
			else
			{
				right=mid;
			}
		}
	}

	private static void search2d(int[][] a, int target) {

		int left = -1, right = a.length * a[0].length;

		while (left + 1 < right) {
			int mid = (left + right) / 2;
			int row = mid / a.length;
			int col = mid % a[0].length;
			if (a[row][col] < target) {
				left = mid;
			} else {
				right = mid;
			}
		}
		if (right == a.length * a[0].length) {
			System.out.println(-1 + " " + -1);
		} else {
			System.out.println(right / a.length + " " + right % a[0].length);
		}
	}
}
