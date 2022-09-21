package com.interview1array;

public class MissingNumberInArray {

	public static void main(String[] args) {
      //Array should not have Duplicate
	  // Array no need to be shorted order
	  // value should be in range
		int a[] = { 1, 2, 4, 5, 6 };

		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of the Element in Array" + sum1);
		int sum2 = 0;
		for (int i = 1; i <= 6; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("sum of the element in a range " + sum2);
		System.out.println("missing number in a array is  " + (sum2 - sum1));
	}
}
