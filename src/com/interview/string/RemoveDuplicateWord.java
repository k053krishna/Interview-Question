package com.interview.string;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String str="i am am Rahul";
		 String[] strArray=str.split(" ");
		Set<String> set=new LinkedHashSet<String>();
		
		for(String x:strArray) {
			set.add(x);
		}
			Iterator<String> itr=set.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next() + " ");
			}
		}
	}

