package interview1;

import java.util.Scanner;

public class Factorial {
	public int FactorialNumbar(int num) {

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println("Enter the no");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int result = factorial.FactorialNumbar(num);
		System.out.println("Factor of " + num + " is " + result);
	}
}
