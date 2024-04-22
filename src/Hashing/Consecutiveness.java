package Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Consecutiveness {
	public static void main(String[] args) { Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    HashSet<Integer> hs = new HashSet<>();
    for (int num : arr) {
        hs.add(num);
    }
    int maxCount = 0;
    for (int num : arr) {
        if (!hs.contains(num - 1)) {
            int currentCount = 1;
            while (hs.contains(num + currentCount)) {
                currentCount++;
            }
            maxCount = Math.max(maxCount, currentCount);
        }
    }
    System.out.println(maxCount);}
}
