package interview1;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count<=2) {
			System.out.println( num + " No is a prime number");
		}else {
			System.out.println( num+ " No is not a prime Number");
		}
		
	}
}
