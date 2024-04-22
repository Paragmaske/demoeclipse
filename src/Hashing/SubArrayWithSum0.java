package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class SubArrayWithSum0 {
	public static void main(String[] args) {

		int[] array = {-1,2,-2,3,-3};
		int noOfZeroSubArrray = 0;
		for (int i = 0; i < array.length; i++) {
			int windSum = 0;
			for (int j = i; j < array.length; j++) {
				windSum = windSum + array[j];
				if (windSum == 0) {
					noOfZeroSubArrray++;
				}
			}
		}

		System.out.println(noOfZeroSubArrray);
	}
}