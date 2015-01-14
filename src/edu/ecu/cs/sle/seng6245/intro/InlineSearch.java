package edu.ecu.cs.sle.seng6245.intro;

public class InlineSearch {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 3, 4, 5, 6, 7 };
		
		for (int i = 0; i < a1.length; ++i) {
			if (a1[i] == 3) {
				System.out.println("Found 3 at index " + i + " in array a1");
				break;
			}
		}

		for (int i = 0; i < a1.length; ++i) {
			if (a2[i] == 3) {
				System.out.println("Found 3 at index " + i + " in array a2");
				break;
			}
		}
	}

}
