package cpt3.literals;

import java.awt.Button;

public class Literals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	//integer literals
		//Octal
			int  eightOct = 010;
		// Hexadecimal
			long hexX = 0x0001l;
			int hexY = 0x7fffffff;
			int hexZ = 0xDeadCafe;
			
		//floats and doubles
			//floats are 64bits
			// float objects are 32 bits and must be cast (F)
			// loss of precision possible
			float d = 11301874.9881024f;
			//int x2 = 123,45; < won't compile >>comma
			
		// Boolean Literals
			// Can only be true or false, not 0 or 1
			// boolean f = 0; << //won't compile
			boolean t = true;
			
		// Character Literals
			// Represented by a single char in single quotes
			// or Unicode
			char a = (char) -65;// 16bit hex range. can use oct, hex or dec.
			char b = 'b';
			char letterN = '\u004e';
			
		//Primitive Assignments & casting
			byte a1 = 001;
			byte a2 = 010;
			byte aSum = (byte) (a1 + a2);
			
			
					
			
		printResults(eightOct, hexX, hexY, hexZ, 
				d, a, b, letterN);
		System.out.println("bytemath: aSum = " + (byte)aSum);
	}
	

	private static void printResults(int eightOct, long hexX, int hexY,
			int hexZ, float d, char a, char b, char letterN) {
		System.out.println("Octal 010 = " + eightOct );
		System.out.println("HexX = " + hexX + ", HexY = " + hexY +
				", HexZ = " + hexZ);
		System.out.println("Double d = " + d);
		System.out.println("Character Literals: a = " + a + ", b = " + 
				b +" & letterN = " + letterN);
	}

}
