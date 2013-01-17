/**
 * 
 */
package chapter.two.overriding.animals;

/**
 * @author Ken Weigand
 *
 */
public class TestAnimals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Horse();
		a.eat();
		b.eat();  // superclass method is overridden
		a.move();
		b.move(); // superclass method is overridden

	}

}
