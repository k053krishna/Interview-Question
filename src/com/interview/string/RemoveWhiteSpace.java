package com.interview.string;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String str="java  programming  selenium    automation";
		System.out.println("before removing the white space: " +str);
		
		str=str.replaceAll("\\s" ,"");
		System.out.println("After the removing the white space: " +str);
	}
}
