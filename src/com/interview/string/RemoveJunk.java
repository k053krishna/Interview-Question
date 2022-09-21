package com.interview.string;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s="#$!%%^()&^%&*()i am krishna23234564556";
		
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
	}
}
