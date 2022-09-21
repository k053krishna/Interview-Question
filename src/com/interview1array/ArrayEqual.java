package com.interview1array;

import java.util.Arrays;

public class ArrayEqual {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int a1[]= {1,2,3,4,5,6};
		int a2[]= {1,2,3,4};
		System.out.println(Arrays.equals(a, a1));
		System.out.println(Arrays.equals(a1, a2));
	}
}
