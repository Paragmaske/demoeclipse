package BinarySearch;

public class MedianOfSortedArray {

	public static void main(String[] args) {
		int[] a = { 1, 2 };
		int[] b = { 3,4 };
		System.out.println(findMedianSortedArrays(a, b));
	}

	static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] ans = new int[nums1.length + nums2.length];

		int left = 0;
		int right = 0;
		int ansp = 0;
		while (left < nums1.length && right < nums2.length) {

			if (nums1[left] >= nums2[right]) {
				ans[ansp] = nums2[right];
				right++;
				ansp++;
			} else {
				ans[ansp] = nums1[left];
				left++;
				ansp++;
			}
		}

		for (int k = left; k < nums1.length; k++) {
			ans[ansp] = nums1[left];
			left++;
			ansp++;
		}
		for (int k = right; k < nums2.length; k++) {
			ans[ansp] = nums2[right];
			right++;
			ansp++;
		}

		return (ans.length % 2 != 0) ? ans[ans.length / 2] : (ans[ans.length / 2] + ans[ans.length / 2 - 1]) / 2.0;

	}
}
