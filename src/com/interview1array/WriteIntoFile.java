package com.interview1array;

import java.io.FileWriter;

public class WriteIntoFile {

	public static void main(String[] args) {
		try {
			FileWriter fw= new FileWriter("link");
			fw.write("This is Interview question");
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
