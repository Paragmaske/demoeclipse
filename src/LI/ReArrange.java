package LI;

import java.util.HashSet;

public class ReArrange {
	public static void main(String[] args) {
		int[] a = {-1,4,-1,-1,-1};
//		re(a);
		rear(a);
	}

	private static void rear(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=-1 && a[i]!=i) {
				int temp= a[a[i]];
				a[a[i]]=a[i];
				a[i]=temp;
				i--;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

	private static void re(int[] a) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i : a) {
			if (i >= 0) {
				hs.add(i);
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (hs.contains(i)) {
				a[i] = i;
			} else {
				a[i] = -1;
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
