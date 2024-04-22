import java.util.Arrays;

public class MinPockets {
	public static void main(String[] args) {
		int[] a = {1,2,2,3,3,4};
		Arrays.parallelSort(a);
// 1 2 2 3 3 4
		int left = 0;
		int right = 1;
		int max = Integer.MIN_VALUE;
		int count = 0;
		while (right < a.length) {

			if (a[left] == a[right]) {
				count++;
				right++;
			} else {
			
				count = 0;
				left=right;
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
	}
}
