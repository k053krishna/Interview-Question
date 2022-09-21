package interview1;


import java.util.Scanner;
//int a = 251,153,9474;,1634

public class ArmstrongNum {
	public boolean ArmstrongNumber(int num) {
		int tempvalue = num;
		int sum = 0;
		while (num != 0) {
			int remender = num % 10;
			sum = sum + (remender * remender * remender);
			num = num / 10;
		}
		if (sum == tempvalue) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		ArmstrongNum armstrongNum=new ArmstrongNum();
     System.out.println("Enter the number");
     Scanner scanner=new Scanner(System.in);
     int no=scanner.nextInt();
     if(armstrongNum.ArmstrongNumber(no)) {
    	 System.out.println("No is a armstrong no");
     }else {
    	 System.out.println("No is not a armstrong no");
     }
     
	}
}
