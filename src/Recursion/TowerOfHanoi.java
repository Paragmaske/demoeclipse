package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a =sc.nextInt();
	System.out.println(Integer.valueOf((int) (Math.pow(2, a)-1)));
	calTower(a,1,2,3);
}

private static void calTower(int disk, int source, int destination, int helper) {

	if(disk==1)
	{
		System.out.println(disk+" "+source+" "+destination);
	return;
	}
	
	calTower(disk-1, source, helper, destination);
	System.out.println(disk+" "+source+" "+destination);
	calTower(disk-1, helper, destination, source);
}


}
