package edu.ecu.cs.sle.seng6245.intro;

public class AbstractedSearch {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 3, 4, 5, 6, 7 };

		int idx1 = ArrayRoutines.findInIntArray(a1, 3);
		int idx2 = ArrayRoutines.findInIntArray(a2, 3);
		
		if (idx1 >= 0) {
			System.out.println("Found 3 at index " + idx1 + " in array a1");
		}

		if (idx2 >= 0) {
			System.out.println("Found 3 at index " + idx2 + " in array a1");
		}
	}
}
