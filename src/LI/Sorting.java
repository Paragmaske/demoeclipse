package LI;

public class Sorting {
	public static void main(String[] args) {

		int[] a = { 3, 4, 5, 1, 8 };
		mergeSort(a);
	}

	private static void mergeSort(int[] a) {
		
		int mid=a.length/2;
		
		merge(a,0,mid);
		merge(a,mid+1,a.length);
		
	}

	private static void merge(int[] a, int start, int end) {
		
	}
}