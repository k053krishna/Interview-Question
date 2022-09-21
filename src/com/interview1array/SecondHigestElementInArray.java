package com.interview1array;

import java.util.Arrays;

public class SecondHigestElementInArray {

	public static void main(String[] args) {
		
		int array[]= {1,20,30,22,40,65,67,89,87,88};
		Arrays.sort(array);
		System.out.println("second higest element in array " +array[array.length-2]);
	}
}
