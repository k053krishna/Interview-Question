package com.interview.string;

public class CountCharecter {

	public static void main(String[] args) {
		
		String str="I am Indian";
		int count=0;
		//int a=str.length();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
