package com.interview.string;
//Number of word count in a String
import java.util.Scanner;

public class CountTheWord {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();// welcome to java
		
		int count=1;
		for (int i = 0; i < s.length() ; i++) {
			
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
				count++;
			}
		}
		System.out.println("Number of word in a String: " +count);
	}
}
