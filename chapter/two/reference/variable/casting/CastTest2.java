package chapter.two.reference.variable.casting;

public class CastTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal[] a = { new Animal(), new Dog(), new Animal() };
		for (Animal animal : a) {
			animal.makeNoise();
			if (animal instanceof Dog) {
				// ((Dog) animal).playDead(); //try to do Dog behavior
				Dog d = (Dog) animal; //cast to object
				d.playDead();
			}
		}

	}

}
