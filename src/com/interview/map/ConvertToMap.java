package com.interview.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertToMap {

	public static void main(String[] args) {
		// an ArrayList of String object
		List<String> listOfString = new ArrayList<>();
		listOfString.add("Java");
		listOfString.add("JavaScript");
		listOfString.add("Python");
		listOfString.add("C++");
		listOfString.add("Ruby");
		System.out.println("list of string: " + listOfString);

		// converting ArrayList to HashMap before Java 8
		Map<String, Integer> map = new HashMap<>();
		for (String str : listOfString) {
			map.put(str, str.length());
		}
		System.out.println("generated map: " + map);

	}
}
