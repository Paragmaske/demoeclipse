package Contest;

import java.util.Scanner;

public class FillTheSegment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] ar = new int[num];
		int window = sc.nextInt();
		int n = sc.nextInt();
		int[] numar = new int[n];
		for (int i = 0; i < n; i++) {
			numar[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int j = numar[i] - 1;
			ar[j] = 1;
		}
		//fillSeg(ar, window);
		fillSegOptimised(ar,window);
	}

	private static void fillSegOptimised(int[] ar, int window) {
		int maxCount=Integer.MAX_VALUE;
		int count1=0;
		int currWind=0;
		int left=0;
		int right=0;
		while(right<ar.length)
		{
			if(currWind==window)
			{
				maxCount=Math.min(maxCount, count1);
				if(ar[left]==1) count1--;
				currWind--;
				left++;
	      	
			}
			if(ar[right]==1) count1++; right++;
			currWind++;
			if(right==ar.length-1)
				{if(ar[left]==1) count1--; maxCount=Math.min(maxCount, count1);}
		}
		System.out.println(maxCount);
	}

	private static void fillSeg(int[] n, int window) {

		int minCount = Integer.MAX_VALUE;
		for (int i = 0; i < n.length - window; i++) {
			int c = 0;
			for (int j = 0; j < window; j++) {
				if (n[i + j] == 1) {
					c++;
				}
			}
			if (minCount > c) {
				minCount = c;
			}
		}
		System.out.println(minCount);
	}
}
