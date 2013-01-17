package c2.static_examples;
/**
 * Static instance counter example
 * @param args
 */
public class Frog {
	static int frogCount; // Declare and initialize
							 // Static variable
	
	public Frog() {
		frogCount += 1; // Modify the value in constructor
	}
	
	public static void main(String[] args) {
		new Frog();
		new Frog();
		new Frog();
		new Frog();
		System.out.println("Frog count is now " + frogCount + ".");

	}

}
