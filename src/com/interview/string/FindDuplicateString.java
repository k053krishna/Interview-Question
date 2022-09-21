package com.interview.string;

public class FindDuplicateString {

	public static void main(String[] args) {
		boolean status = false;
		String str = "programming";
        char[]  ch=str.toCharArray();
		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					status = true;
					System.out.print(ch[j]);
				}
			}
		}
		if (status == false) {
			System.out.println("Duplicate string not found");
		}
	}
}
