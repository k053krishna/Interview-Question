package interview1;

import java.util.Scanner;

public class FabonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
        int value1=0;
        int value2=1;
        int temp;
        for(int i=1;i<=num;i++) {
        	System.out.println(+value1);
        	temp=value1;
        	value1=value1+value2;
        	value2=temp;
        }
	}
}
