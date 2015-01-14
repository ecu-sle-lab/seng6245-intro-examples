package edu.ecu.cs.sle.seng6245.intro;

public class AbstractedSum {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		
		System.out.println("x = " + x + " and y = " + y);
		
		int z = MathStuff.sum(x, y);
		
		System.out.println("z = " + z);
	}

}
