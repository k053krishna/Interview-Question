package com.interview.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharecter {

	public static void main(String[] args) {

		String s="programming";
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		StringBuffer sb=new StringBuffer();
		for(Character st:set) {
			sb.append(st);
		}
		System.out.println("Afetr removing duplicate charecter...\n" +sb);
	}
}