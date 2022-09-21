package interview1;

public class Rev {
	public static void main(String[] args) {
		String str = "welcome to java programe";
		String[] word = str.split("\\s");

		String reverseword = " ";
		for (String w : word) {
			StringBuilder sbl = new StringBuilder(w);
			sbl.reverse();
			reverseword = reverseword + sbl.toString() + " ";
		}
		System.out.println(reverseword);

	}
}
