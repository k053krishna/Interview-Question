package interview1;

import java.util.Scanner;

public class ReverseNumber {

	public static int getreverseNumber(int num) {
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10;
			reverse = reverse + num % 10;
			num = num / 10;
		}
		return reverse;
	}
            public static void main(String[] args) {
	    	System.out.println("Enter the number");
	    	Scanner scanner =new Scanner(System.in);
	    	int num=scanner.nextInt();
	    	ReverseNumber reverseNumber=new ReverseNumber();
	    	int result=reverseNumber.getreverseNumber(num);
	    	System.out.println("reverse no is " +result);

	}

}
