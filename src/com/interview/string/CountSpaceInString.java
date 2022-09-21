package com.interview.string;

public class CountSpaceInString {

	public static void main(String[] args) {
		String str="this is a velocity training center";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if (ch==' ') {
			count++;
			}
		}
		System.out.println("number of space in a string " +count);
	}
}
