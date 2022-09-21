package interview1;

import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
     System.out.println("Enter the number");
     Scanner scanner=new Scanner(System.in);
     int num=scanner.nextInt();
     
     for(int i=1;i<=num;i++) {
    	 if(num%i==0) {
    		 System.out.println("Factor of number is>>> " +i);
    	 }
     }
    		 
     
	}
}
