package interview1;

public class Swaip {
	public static void main(String[] args) {
		int a = 1032;
		int b = 2033;
		int temp;
		System.out.println("Before swaping");
		System.out.println("value of a is >>" +a);
		System.out.println("value of b is >>" +b );
		System.out.println("After swaping");
		/*
		temp = a;
		a = b;
		b = temp;
		*/
		/*
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		*/
		a=a*b;//200
		b=a/b;//10
		a=a/b;//20
		System.out.println("value of a is>>" +a);
		System.out.println("value of b is >>" +b);
	}
}
