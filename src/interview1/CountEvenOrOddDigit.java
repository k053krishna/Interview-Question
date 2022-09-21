package interview1;

public class CountEvenOrOddDigit {
public static void main(String[] args) {
	int num=122334454;
	int Evennum_count=0;
	int Oddnum_count=0;
	while(num>0) {
		int remender=num%10;
		if(remender%2==0) {
			Evennum_count ++;
		}else {
			Oddnum_count ++;
		}
		num=num/10;
	}
	System.out.println("number of even num " +Evennum_count);
	System.out.println("number of odd num " +Oddnum_count);
}
}
