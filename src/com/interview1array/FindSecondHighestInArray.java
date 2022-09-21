package com.interview1array;

import java.util.Arrays;

public class FindSecondHighestInArray {

	public static void main(String[] args) {
		
		int a[] = { 11, 23, 45, 34, 56, 65, 44, 33, 54, 47 };
		
		Arrays.sort(a);
		System.out.println(" second largest number in array " + a[a.length - 2]);
	}
}
