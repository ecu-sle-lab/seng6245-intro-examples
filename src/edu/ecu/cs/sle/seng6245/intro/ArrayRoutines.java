package edu.ecu.cs.sle.seng6245.intro;

public class ArrayRoutines {

	public static int findInIntArray(int[] toSearch, int toFind) {
		for (int i = 0; i < toSearch.length; ++i) {
			if (toSearch[i] == toFind) {
				return i;
			}
		}
		return -1; // We did not find anything
	}
}
