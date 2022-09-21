package com.interview1array;

import java.io.FileInputStream;
import java.util.Scanner;

public class ReadTheFile {
 
	public static void main(String[] args) {
		 try {
			FileInputStream fis=new FileInputStream("link") ;
			Scanner sc=new Scanner(fis);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				sc.close();
			}
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}
}
