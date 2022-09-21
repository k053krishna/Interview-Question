package com.interview.string;

import java.util.Scanner;

public class PalindromString{

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner scanner=new Scanner (System.in);
		String str=scanner.next();
		String orgstr=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev= rev+str.charAt(i);
		}
		if(orgstr.equals(rev)) {
			System.out.println( orgstr+ "is a palindrom string");
		}else {
			System.out.println( orgstr+ "is not a palindrom string");
		}
}
}