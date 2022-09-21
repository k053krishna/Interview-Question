package interview1;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner =new Scanner(System.in);
		int num=scanner.nextInt();
		
		if(num%2!=0) {
			System.out.println("Number is odd number");
		}else {
			System.out.println("Number is  not  odd number");
		}
		
	}
}
