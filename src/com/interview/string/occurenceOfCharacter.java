package com.interview.string;

import java.util.HashMap;

public class occurenceOfCharacter {
	public static void main(String[] args) {
		String s = "my name is krishna";
		String str = s.replaceAll("\\s", "");
		HashMap<Character, Integer> hMap = new HashMap<>();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (hMap.containsKey(str.charAt(i))) {
				int count = hMap.get(str.charAt(i));
				hMap.put(str.charAt(i), ++count);
			} else {
				hMap.put(str.charAt(i), 1);
			}
		}
		System.out.println("my name is krishna");
		System.out.println(hMap);
	}
}