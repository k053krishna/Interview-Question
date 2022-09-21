package interview1;

public class OccuranceOfCharacterInWord {

	public static void main(String[] args) {
		
		String str ="krishna";
		int count =1;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
		for(int j=i+1;j<str.length();j++) {
			if(ch==str.charAt(j)) {
				count++;
				System.out.println(" char " +ch);
				System.out.println(" char " +ch+ " occured " +count+ "times ");
				
			}
		}if(count==1) {
			System.out.println(ch+ " char in a word occured "+"  " +count + "times ");
		}
		}
	}
}
