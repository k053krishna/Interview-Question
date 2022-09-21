package com.interview1array;

public class SumOfArray {
    public static void main(String[] args) {
		int a[]= {1,5,4,9,7,6};
		int sum=0;
	/*	
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of number is ...." +sum);
	*/
		for(int value:a) {
			sum=sum+value;
			System.out.println("sum of arry is >>>"   +sum);
		}
	}
}
