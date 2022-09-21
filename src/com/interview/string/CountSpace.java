package com.interview.string;

public class CountSpace {

	public static void main(String[] args) {
		String str="i am  krishna  kumar ";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
