package BinarySearch;

public class SumDiffOfNum {
	public static void main(String[] args) {
		int N = 15;
		int diff = 4;
//		findDiff(N, diff);
		finddiffLogN(N, diff);
	}

	private static void finddiffLogN(int n, int diff) {

		int left = 1;
		int right = n;
		while (left <= right) {
			int mid = (left + right) / 2;
			
			if(prdicateFun(mid,diff,n)==0) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		System.out.println(n-right);

	}

	private static int prdicateFun(int mid, int diff, int n) {
		String valueOf = String.valueOf(mid);
		int ans = 0;

		for (int j = 0; j < valueOf.length(); j++) {
			ans = ans + Character.getNumericValue(valueOf.charAt(j));
		}
		if (mid - ans >= diff) {
			return 0;
		}
		
		return 1;
	}

	static void findDiff(int N, int diff) {
		int count = 0;
		for (int i = 1; i <= N; i++) {
			String valueOf = String.valueOf(i);
			int ans = 0;

			for (int j = 0; j < valueOf.length(); j++) {
				ans = ans + Character.getNumericValue(valueOf.charAt(j));
			}
			if (i - ans >= diff) {
				count++;
			}
		}
		System.out.println(count);
	}

}
