package com.interview1array;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToInteger {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("Before convert in array " +list);
		Integer []intArray =new Integer[list.size()];
		list.toArray(intArray);
		for(Integer integer:intArray) {
			System.out.print(integer);
		}
	}
}
