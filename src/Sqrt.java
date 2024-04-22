
public class Sqrt {
	public static void main(String[] args) {
		System.out.println(mySqrt(2147395599));
	}

	public static int mySqrt(int x) {

		long left = 0;
		long right = x;
		while (left <= right) {
			long mid = left + (right - left) / 2;

			if ((mid * mid) == x) {
				return (int) mid;
			} else if (mid * mid > x) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}
		return (int) right;
	}

}
