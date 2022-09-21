package com.interview.string;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {

	public static void main(String[] args) {

		String str = "my name is krishna";
		String s=str.replaceAll("\\s", "");
		Map<Character, Integer> map = new HashMap<>();
		
		char[] chars = s.toCharArray();
		
		for (char ch : chars) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				int value=map.get(ch);
				map.put(ch, value+1);
			}
		}
		System.out.println(map);
	}
}
