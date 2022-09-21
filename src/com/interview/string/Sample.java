package com.interview.string;

public class Sample {

	public static void main(String[] args) {

		String str = "8578%#%^%&*&)(*kri shna)";
		String s = str.replaceAll("[^a-zA-Z]","");
		System.out.println(s);
	}
}
