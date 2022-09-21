package interview1;

import java.util.HashSet;

public class RemoveDuplicateElement {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 22, 3, 4, 5,4, 3,67 };
		
			HashSet<Integer> hs=new HashSet<Integer>();
			for(int i=0;i<a.length;i++) {
				hs.add(a[i]);
			}
			for(int num:hs) {
				System.out.print(num +",");
			}
		}
	}