package LI;

public class QuickSort {
	public static void main(String[] args) {
		int[] a = {303,387,435,495,995,784,606};
		//
		quick(a, 0, a.length);
		for (int i : a) {
			System.out.println(i);
		}
	}

	private static void quick(int[] a, int i, int length) {
		if(i<length)
		{
		int partitionIndex = partition(a, i, length);
		quick(a, i, partitionIndex);
		quick(a, partitionIndex + 1, length);
	}}

	private static int partition(int[] a, int left, int length) {

		int pivotEle = a[left];

		int lp = left + 1;
		int rp = length - 1;
boolean flag =false;
		while (lp <= rp) {

			while (a[lp] < pivotEle) {
				lp++;
				if(lp>rp) flag =true; break;
			}
			while (a[rp] > pivotEle) {
				rp--;
				if(rp<lp) flag =true; break;
			}
			if(flag==true) break;
			if (a[lp] > pivotEle && a[rp] < pivotEle) {
				int temp = a[lp];
				a[lp] = a[rp];
				a[rp] = temp;
				lp++;
				rp--;

			}
			 

		}
		
		int temp = a[left];
		a[left] = a[rp];
		a[rp] = temp;


		return rp;

	}
}
