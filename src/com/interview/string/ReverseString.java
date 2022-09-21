package com.interview.string;

public class ReverseString {
	public static void main(String[] args) {
		/*
		String str = "Welcome To Java";// original String
		String[] word = str.split(" ");// splitting string into word

		String reverseString = " ";

		for (String w : word) {
			String reverseword = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				reverseword = reverseword + w.charAt(i);

			}
			reverseString = reverseString + reverseword + " ";
		}
          System.out.println(reverseString);
          */
		
		String str="Welcome To Jave";
		String[]word=str.split("\\s");
		
		String reverseword="";
		for(String w:word) {
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverseword=reverseword+sb.toString()+" ";
			
		}
		System.out.println(reverseword);
	}
}
