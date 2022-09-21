package com.interview1array;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[]= {20,10,30,40,50,60};
			int searchElement=50;
			boolean flag=false;
			
			for(int i=0;i<a.length;i++) {
				if(searchElement==a[i]) {
					System.out.println("element fount at position " +i);
					flag=true;
					break;
				}
			}
			if(flag==false) {
			System.out.println("Element not found");
			}
	}
}
