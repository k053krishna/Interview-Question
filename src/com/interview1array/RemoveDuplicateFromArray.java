package com.interview1array;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 3, 4, 5, 6, 7, 8, 7 };
		System.out.println(Arrays.toString(a));
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i : a) {
			int count = 0;
			for (int i1 : a) {
				if (i1 == i) {
					count++;
				}
			}
			if (count > 1) {
				al.add(i);
			}
		}
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for (int i : a) {
			if (al.contains(i)) {
				continue;
			}
			al1.add(i);
		}
		System.out.println(al1);
	}
}
