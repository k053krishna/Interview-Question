package interview1;

public class SumOfDigit {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		while (num != 0) {
			int remender=num%10;
			sum=sum+remender;
			//sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("Sum of digit is>> " + sum);
	}
}
