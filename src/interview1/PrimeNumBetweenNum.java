package interview1;

import java.util.Scanner;

public class PrimeNumBetweenNum {
	public static void main(String[] args) {
		System.out.println("Enter the frist number");
		Scanner scanner = new Scanner(System.in);
		int firstNum=scanner.nextInt();
		System.out.println("Enter the Second number");
		int secondNum=scanner.nextInt();
		
		for(int i=firstNum;i<=secondNum;i++) {
			int count=0;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if (count==0) {
			System.out.println("Prime number is>>" +i);
		}
		}
		
		
	}
}
