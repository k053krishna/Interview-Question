package interview1;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
        int OrgNum=num;
        int reverse=0;
        while(num!=0) {
        	 reverse=reverse*10;
        	reverse=reverse+num%10;
        	num=num/10;
         }
        if(OrgNum==reverse) {
        System.out.println(OrgNum+ " is pelindrome number");
	}else {
		 System.out.println(OrgNum+ " is not pelindrome number");
	}
		 
	}
}
