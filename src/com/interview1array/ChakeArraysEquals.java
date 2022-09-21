package com.interview1array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChakeArraysEquals {
	public static void main(String[] args) {

		int a1[] = { 1, 2, 3, 4, 5, 6 };
		int a2[] = { 1, 2, 3, 4, 5, 6 };
		/*
		 * boolean status=Arrays.equals(a1, a2); if (status==true) {
		 * System.out.println("Arrays are Equal"); }else {
		 * System.out.println("Arrays are NOT Equals"); }
		 * System.out.println(Arrays.equals(a1,a2));
		 */
		boolean status = true;
		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					status = false;
				}
			}
		} else {
			status = false;
		}
		if (status == true) {
			System.out.println("Arrays are Equals");

		} else {
			System.out.println("Arrays are Not Equals");
		}
	}
}
