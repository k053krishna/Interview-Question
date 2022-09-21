package com.interview.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Tutorial {

	public static void main(String[] args) {
		List<Integer> list=new  CopyOnWriteArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			Integer a=itr.next();
			System.out.println(a);
			list.add(a);
		}
	     System.out.println("final:" +list);
	}
}
