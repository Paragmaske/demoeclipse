package BinarySearch;

public class SquareRoor {
	public static void main(String[] args) {
		long n = 101;

		double left = 0;
		double right = 100;

		while (right-0.01>left) {
			double mid = left + (right - left) / 2;

			if (mid * mid == n) {
				System.out.println(mid);
				System.exit(0);
			} else if (mid * mid > n) {
				right = mid;
			} else {
				left = mid ;
			}
		}

		System.out.println(left);
	}
}
